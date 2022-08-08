package j12_다형성2.상속;

public class KakaoTalk extends Messenger{

	

	@Override
	public void send() {
		System.out.println("카카오톡으로 메세지를 전송");
		
	}

	@Override
	public void receive() {
		System.out.println("카카오톡으로 메세지를 수신");
		
	}
	
	public void sendPresent() {
		System.out.println("🎁카카오톡 선물 보내기");
	}

}
