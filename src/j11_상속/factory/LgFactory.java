package j11_상속.factory;

public class LgFactory extends Factory{
	public LgFactory(int factoryNumber) {
		super(factoryNumber);
	}
	@Override
	public void start() {
		System.out.print("LG ");
		super.start();
	}
	@Override
	public void stop() {
		System.out.print("LG ");
		super.stop();
	}
	//LG팩토리만 있는 메소드
	// 업캐스팅 후에 쓸 수 없다. 
	public void produceSmartTv() {
		System.out.println("LG 스마트 TV를 생산합니다.");
	}
}
