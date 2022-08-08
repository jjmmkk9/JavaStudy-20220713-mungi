package j12_다형성2.상속;

public class MessengerMain {
	public static void main(String[] args) {
		KakaoTalk kakaoTalk = new KakaoTalk();
		FacebookMessenger facebookMessenger = new FacebookMessenger();
		Messenger messenger = kakaoTalk;
		
		if(messenger instanceof KakaoTalk) {
			System.out.println("카카오톡으로 메시지를 보냅니다.");
			kakaoTalk.send();
		}else {
			System.out.println("페메로 메시지를 보냅니다.");
			facebookMessenger.send();
		}
		
		
		
	}
	
}
