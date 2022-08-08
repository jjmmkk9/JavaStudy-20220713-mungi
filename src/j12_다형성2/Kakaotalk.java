package j12_다형성2;

public class Kakaotalk implements Messenger{

	@Override
	public void send() {
		System.out.println("카카오톡을 보냅니다.");
		
	}
	@Override
	public void receive() {
		// TODO Auto-generated method stub
		
	}

	public void sendPresent() {
		System.out.println("🎁카카오톡에서 선물을 보냅니다. ");
	}

}
