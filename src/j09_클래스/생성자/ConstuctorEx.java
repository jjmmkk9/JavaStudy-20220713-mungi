package j09_클래스.생성자;

public class ConstuctorEx {
	String name;
	int age;
	
	//NoArgsConstructor  인수, 매개변수 x
	public ConstuctorEx() {
		System.out.println("기본생성자");
	}
	//RequiredArgsConstructor  매개변수 필수
	public ConstuctorEx(String name) {
		System.out.println("매개변수: " + name);
		System.out.println("String name을 매개변수로 받는 생성자");
		this.name = name;
	}
	//RequiredArgsConstructor 매개변수 필수
	public ConstuctorEx(int age) {
		System.out.println("매개변수: " + age);
		System.out.println("int age를 매개변수로 받는 생성자");
	}
	//AllArgsConstructor 모든 매개변수를 받는
	public ConstuctorEx(String name, int age) {
		System.out.println("String 매개변수: " + name);
		System.out.println("int 매개변수: " + age);
		System.out.println("전체생성자");
	}
	
	
}
