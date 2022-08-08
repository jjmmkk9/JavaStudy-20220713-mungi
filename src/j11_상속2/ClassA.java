package j11_상속2;
	//얘는 생성안하고 틀로만 쓰겠다.
public abstract class ClassA {
	
	public ClassA() {
		System.out.println("\n(ClassA) 부모 클래스 생성자 호출");
	}
	public void printInfo() { //일반메소드
		System.out.println("부모의 정보도 출력");
	}
	
	public abstract void showData();
}
