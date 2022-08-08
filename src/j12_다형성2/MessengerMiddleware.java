package j12_다형성2;

public class MessengerMiddleware {
	/*
	 * middleware 굳이 만들어 준 이유는 인터페이스는 생성자를 만들 수 없어서
	 * 현재 클래스처럼 생성될 때 messenger 타입을 받을 수가 없기 때문일것임
	 * 인터페이스는 그리고 변수도 final, static으로 선언해야한다. 
	 * 인터페이스는 그냥 공통 기능만 띡 적어놓는 것인듯 아마.
	 * 모   두 구현해야 하기 때문에 딱 공통되는 기능들만 메소드
	 * 
	 * middleware를 만들어 줌으로 DI 가능 근데 상속으로 했어도 됐을듯 해보자!
	 */
	private Messenger messenger;

	public MessengerMiddleware(Messenger messenger) {
		super();
		this.messenger = messenger;  //MessengerMiddleware가 생성되면 messenger를 받음	(카카오냐, 페이스북이냐)
	}
	public void sendMessage() {  //new messengerMideleware. 해서 sendMessage해주면 카카오, 페이스북. send됨
		messenger.send();
	}
	public void receiveMessage() {  //new messengerMideleware. 해서 sendMessage해주면 카카오, 페이스북. receive됨
		messenger.receive();
	}
	public void runAddOns() {   //추가기능
		System.out.println("추가 기능 실행");
		
		if(messenger instanceof Kakaotalk) { 				//messenger가 kakaotalk 이면 
			Kakaotalk kt = (Kakaotalk) messenger;  			//kt에 messenger를 다운캐스팅해
			kt.sendPresent();								//다운캐스팅 완. sendPresent 메소드 사용 가능
			
		}else if(messenger instanceof FacebookMessenger) {			//messenger가 페메면
			FacebookMessenger fm = (FacebookMessenger) messenger;	//fm에 messenger 다운캐스팅 해 
			fm.call();												//다운캐스팅 완 .call 메소드 사용 가능
		}else {
			System.out.println("다운캐스팅 불가능");				//전부 아니면? 
		}
	}
	
}
