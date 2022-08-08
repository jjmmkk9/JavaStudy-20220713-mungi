package j12_다형성2;

public class MessengerMain {

	public static void main(String[] args) {
		Kakaotalk kt = new Kakaotalk();						//카톡 객체 생성
		FacebookMessenger fm  = new FacebookMessenger();	//페메 객체 생성
		
		Messenger messenger = fm;		//messenger는 페메로 할게 
		
		MessengerMiddleware messengerMiddleware = new MessengerMiddleware(messenger);
		messengerMiddleware.sendMessage();
		System.out.println("메시지 전송 완료");
		System.out.println();
		
		messengerMiddleware.receiveMessage();
		System.out.println("새로운 메세지를 받음");
		System.out.println();
		
		messengerMiddleware.runAddOns();
		System.out.println();
	}

}
