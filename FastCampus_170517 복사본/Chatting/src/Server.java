import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.OutputStream;

public class Server {
	
	ServerSocket serverSocket = null;

	// 1. 서버를 생성
	public Server(int port){ // 서버에서 사용할 포트
		try {
			serverSocket = new ServerSocket(port);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 2. 서버동작
	public void process(){
		// 여기서 소켓을 열고 대기
		while(true){
			// 3. 서브 thread 에서 소켓을 열고 대기
			Socket socket;
			try {
				socket = serverSocket.accept(); // <- 여기서 프로그램이 멈춘다
				subProcess(socket); // 서브 thread 에서 소켓을 처리하는 함수로 넘겨준다
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
	}
	
	private void subProcess(Socket socket){
		new Thread(){
			public void run(){
				java.io.InputStream os;
				try {
					os = socket.getInputStream();
					// 스트림을 열고 데이터 통신을 준비
					BufferedReader br = new BufferedReader(new InputStreamReader(os));
					// 줄단위로 데이터를 받아서 화면에 출력
					while(true){
						String message= br.readLine();
						System.out.println(socket.getInetAddress()+":"+message);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}.start();
	}
}