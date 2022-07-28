package j11_상속.factory;

public class FactoryMain2 {

	public static void main(String[] args) {
		//상속을 하면 부모객체에 대입할 수 있다. 
		//업캐스팅 => 상속을 받아야 factory라는 클래스로 묶어서 같이 가동할 수 있다. 
		Factory factory1 = new SamsungFactory(1);
		Factory factory2 = new LgFactory(1);
		
		//배열로 묶어서 삼성이든 엘지든 구분않겠다. 
		Factory[] factories = new Factory[4]; //클래스를 배열에다가 넣어부려~
		factories[0] = new SamsungFactory(1);
		factories[1] = new LgFactory(1);
		factories[2] = new SamsungFactory(2);
		factories[3] = new LgFactory(2);
		
		System.out.println("모든 공장을 가동합니다.");
		for(int i = 0; i < factories.length; i++) {
			factories[i].start();
		}
		System.out.println();
		System.out.println("모든 공장을 중지합니다.");
		for(int i = 0; i < factories.length; i++) {
			factories[i].stop();
		}
		
		
		
	}
}
