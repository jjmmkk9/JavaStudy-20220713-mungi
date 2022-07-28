package j09_클래스.생성자;

public class ConstuctorEx2 {
	String name;
	int age;
//기본 생성자는 보통 이렇게 접어둠
	public ConstuctorEx2() {}
//얘네가 오버로딩
	public ConstuctorEx2(String name) {
		this.name = name;
	}

	public ConstuctorEx2(int age) {
		this.age = age;
	}

	public ConstuctorEx2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
}
