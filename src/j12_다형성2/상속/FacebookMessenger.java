package j12_다형성2.상속;

public class FacebookMessenger extends Messenger{

	

	@Override
	public void send() {
		System.out.println("페메로 메세지를 전송");
		
	}

	@Override
	public void receive() {
		System.out.println("페메로 메세지를 수신");
		
	}
	public void call() {
		System.out.println("☎페메로 전화걸기");
	}

}
