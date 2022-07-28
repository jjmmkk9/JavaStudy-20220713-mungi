package j09_클래스.접근지정자.student;

public class StudentMain {
	public static void main(String[] args) {
		Student s1 = new Student();
		//privqte 변수이기 때문에접근안됨
		s1.setName("김준일");  //setName 메소드 매개변수에 name --> this.name = name
		System.out.println(s1.getName()); //getName return값이 name이라서 출력가능
	}
}
