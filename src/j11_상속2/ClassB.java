package j11_상속2;

public class ClassB extends ClassA{
	
	public ClassB() {
		super(); //얘가 생략되어있다. 
		System.out.println("(ClassB) 첫번째 자식 생성자 호출");
		
	}
	@Override  //일반 메소드를 재정의함
	public void printInfo() {
		System.out.print("첫번째(b) 자식 ");
		super.printInfo(); //"부모의 정보를 출력"
	}
	@Override //추상메소드 구현
	public void showData() {
		System.out.println("총을 만들어서 쏠 준비를 한다. ");
		
	}
	public void addData() {
		System.out.println("데이터를 추가");
	}
}
