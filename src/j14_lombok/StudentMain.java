package j14_lombok;

public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student();
		Student student2 = new Student(20220001, "조문기", 2, 24);
		
		System.out.println(student2);
	}

}
