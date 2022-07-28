package j11_상속.factory;

public class FactoryMain3 {

	public static void main(String[] args) {

		//배열로 묶어서 삼성이든 엘지든 구분않겠다. 
		Factory[] factories = new Factory[4];
		factories[0] = new SamsungFactory(1);
		factories[1] = new LgFactory(1);
		factories[2] = new SamsungFactory(2);
		factories[3] = new LgFactory(2);
		
		//(묵시적 업캐스팅)
		int num = 10;
		double dNum = num;
		System.out.println(dNum);
		
		
		SamsungFactory samsungFactory = new SamsungFactory(1);
		//업캐스팅(묵시적) - 삼성팩토리를 팩토리로 
		Factory f = samsungFactory;
		System.out.println(f);
		
		//명시적 다운캐스팅 - 팩토리에서 삼성팩토리로 
		SamsungFactory sf = (SamsungFactory) f;
		
		//클래스는 다운캐스팅 하려면 업캐스팅 하고 난 후 다운캐스팅 할 수 있다. 
//		Factory factory = new Factory(1);
//		Factory samsung = (SamsungFactory) factory;
//		SamsungFactory  = (SamsungFactory) factory;
		
		
		
		
	}
}
