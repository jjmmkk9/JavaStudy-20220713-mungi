package j12_다형성.추상.Computer;

public class Laptop extends Computer{

	//추상메소드 구현
	@Override
	public void onKeyPress() {
		System.out.println("노트북에서 키보드 입력을 받는다.");
	}
	@Override
	public void onDisplay() {
		System.out.println("노트북 화면을 출력한다.");
	}

}
