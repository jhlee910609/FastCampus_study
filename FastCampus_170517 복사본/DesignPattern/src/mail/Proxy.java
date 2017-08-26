package mail;

public class Proxy implements iProxy {
	
	Server mailServer = null;

	public void sender(Mail mail) {
		// 해당 블록이 끝날 때까지는 해당 블록에 접근할 수 없게 하는 예약어, synchronized
		// 기존 비동기 방식으로 처리, synchronized = 동기 방식으로 처리한다. 
		// 다른 스레드들은 대기하고, 한 테스크가 다 끝나면 그 뒤에 순서대로 진행한다. 
		// 메일 서버가 싱글톤으로 설계되었을 경우, new를 막아줄 수 있음 
		
		if(mailServer == null)
			mailServer = new Server();
		
		mailServer.sender(mail);
	}

	@Override
	public Mail get() {
		
		return null;
	}

}
