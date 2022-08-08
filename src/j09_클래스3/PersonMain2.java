package j09_클래스3;

public class PersonMain2 {

	public static void main(String[] args) {
		Student student1 = new Student("김준일", 29, "부산초등학교", 20220001, 3);
		Teacher teacher1 = new Teacher("조문기", 23, "중국어", 20220002);
		Person person1 = new Student("김준이", 28, "부산초등학교", 20220003, 2);
		
		System.out.println(student1.toString());
		System.out.println(teacher1.toString());
		System.out.println(person1.toString());

	}

}
