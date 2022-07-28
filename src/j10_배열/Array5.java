package j10_배열;

import j09_클래스.접근지정자.student.Student;

public class Array5 {

	public static void main(String[] args) {
		int[] nums = new int[5];
		
		
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	 
		/* int 에는 10이라는 값이 바로 들어간다. 
		 * Student에는 student 라는 객체가 들어간다. */
		
		System.out.println("========================");
		
		Student[] students = new Student[5];
		students[0] = new Student();  //[0]여기는 객체 즉 값이 있다
		students[0].setName("김준일"); //그래서 setName이 된다.
		System.out.println(students[0].getName());
		students[1].setName("김준이"); //[1]여기는 객체가 없어서 들어가지 않음
		
		
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		

	}

}
