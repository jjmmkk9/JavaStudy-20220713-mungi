package j11_상속2;

public class ClassC extends ClassA{
	
	public ClassC() {
		super();  //얘가 생략되어있다. 
		System.out.println("(ClassC) 두번째 자식 생성자 호출");

	}
	@Override  //일반 메소드를 재정의
	public void printInfo() {
		System.out.print("두번째(c) 자식 ");
		super.printInfo();
	}
	@Override  //추상메소드 구현
	public void showData() {
		System.out.println("활을 만들어서 쏠 준비를 한다. ");
		
	}
	public void removeData() {
		System.out.println("데이터를 지움");
	}
}
