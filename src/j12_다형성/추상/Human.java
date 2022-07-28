package j12_다형성.추상;

public class Human extends Animal{
	/*
	 * 이 메소드는 무조건 오버라이드해야한다.  
	 *  => 추상메소드는 무적건 구현해주어야 한다. */
	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}
