package j13_최상위_클래스;

public class EqualsMain {

	public static void main(String[] args) {
		Student s1 = new Student(20220001, "김준일");
		Student s2 = new Student(20220001, "김준일");
		Student s3 = new Student(20220002, "김준이");
		Student s4 = new Student(20220002, "김준일");
		
		System.out.println(s1 == s2); //false
		System.out.println(s1.equals(s2)); //false equals를 주소값 비교가 아닌 값비교 할 수 있게 재정의 해야함
											//<Student>에서 재정의 해줌
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		
	}

}
