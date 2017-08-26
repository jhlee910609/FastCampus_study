package mail;

import java.awt.List;
import java.util.ArrayList;

public class Server implements iProxy {
	
	// 수신한 메일을 저장하는 공간
	ArrayList<Mail> mails = new ArrayList<>();

	@Override
	public void sender(Mail mail) {
		
		System.out.println(mail + " 을 발송하였습니다.");
		
	}

	@Override
	public Mail get() {
		
		Mail mail =new Mail();
		return mail;
	}
	
	private void receiver(){
		mails.add(new Mail());
	}
}
