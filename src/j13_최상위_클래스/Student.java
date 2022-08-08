package j13_최상위_클래스;

import java.util.Objects;

public class Student {
	
	private int studentCode;
	private String name;
	
	//생성자
	public Student(int studentCode, String name) {
		super();
		this.studentCode = studentCode;
		this.name = name;
	}
	
//	@Override //equals
//	public boolean equals(Object obj) {
//		Student student = (Student) obj;
//		boolean result = studentCode == student.studentCode
////				&& name.equals(student.name)   얘랑
//				&& Objects.equals(name, student.name);
//						//얘는 스태틱 메소드 얘랑 똑같음
//		
//		return result;
//	}
	
	public void addStudent(int studentCode, String name) {
		System.out.println("학생을 추가합니다. 근데 걍 만들어본거임");
	}

	@Override //toString
	public String toString() {
		return "Student [studentCode=" + studentCode + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentCode, name);
	}

	@Override //자동생성한 equals
	public boolean equals(Object obj) {
		if (this == obj) //주소가 같으면 true
			return true; 
		if (obj == null) //obj가 null이면 
			return false;
		if (getClass() != obj.getClass()) //this 클래스가 obj의 클래스와 다르면 
			return false;
		Student other = (Student) obj; //obj를 다운캐스팅 시켜
		return Objects.equals(name, other.name) && studentCode == other.studentCode;
	}
	
}
