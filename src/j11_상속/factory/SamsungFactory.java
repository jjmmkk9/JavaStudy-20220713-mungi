package j11_상속.factory;

public class SamsungFactory extends Factory{
	
	public SamsungFactory(int factoryNumber) {
		super(factoryNumber);
	}
	@Override
	public void start() {
		System.out.print("삼성 ");
		super.start(); //super.start 메소드 호출되면 "1공장을 가동합니다."
					  //뜨니까 앞에 "삼성 "을 찍어주겠다.
	}
	@Override
	public void stop() {
		System.out.print("삼성 ");
		super.stop();
	}
	
	//삼성 팩토리만 가지고 있는 메소드
	// => 업캐스팅 후에 쓸 수없다. 
	public void produceSmartPhone() {
		System.out.println("삼성 스마트폰을 생산합니다.");
	}

}
