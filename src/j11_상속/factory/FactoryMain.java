package j11_상속.factory;

public class FactoryMain {

	public static void main(String[] args) {
		SamsungFactory[] samsungFactories = new SamsungFactory[3];
		samsungFactories[0] = new SamsungFactory(1);
		samsungFactories[1] = new SamsungFactory(2);
		samsungFactories[2] = new SamsungFactory(3);
		
		LgFactory[] lgFactories = new LgFactory[3];
		lgFactories[0] = new LgFactory(1);
		lgFactories[1] = new LgFactory(2);
		lgFactories[2] = new LgFactory(3);
		
		System.out.println("삼성공장 가동");
		for(int i = 0; i < samsungFactories.length; i++) {
			samsungFactories[i].start();
		}
		System.out.println("삼성공장 중지");
		for(int i = 0; i < lgFactories.length; i++) {
			lgFactories[i].stop();
		}
		System.out.println("LG공장 가동");
		for(int i = 0; i < lgFactories.length; i++) {
			lgFactories[i].start();
		}
		System.out.println("LG공장 중지");
		for(int i = 0; i < lgFactories.length; i++) {
			lgFactories[i].stop();
		}
		System.out.println("스마트폰 생산");
		for(int i = 0; i < samsungFactories.length; i++) {
			samsungFactories[i].produceSmartPhone();
		}
		System.out.println("TV 생산");
		for(int i = 0; i < lgFactories.length; i++) {
			lgFactories[i].produceSmartTv();
		}
		
		
	}
}
