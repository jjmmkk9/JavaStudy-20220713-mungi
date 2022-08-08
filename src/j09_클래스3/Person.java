package j09_클래스3;
    	//추상클래스는 생성할 수 없다. 
public abstract class Person {
	//클래스는 그룹화다 -> 상속은 관계성 부여
	private String name;
	private int age;
	
//	public Person() {
//	
//	}
	//전체생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract String mealTime();

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
