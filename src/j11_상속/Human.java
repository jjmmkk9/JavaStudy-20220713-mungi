package j11_상속;

public class Human extends Animal{
		public Human() {
			System.out.println("Human 객체 생성");
		}
		@Override  //@ -> 어노테이션 오버라이드: 재정의
		public void move() {
		super.move(); // super. 은 부모객체 주소 참조임
		System.out.println("사람이 두발로 걷습니다.");
		}
// Q. 이렇게 재정의 할거면 왜 굳이 상속받아서 하나??
		
		
		public void readBooks() {
			System.out.println("사람이 책을 읽습니다.");
		}
	
}
