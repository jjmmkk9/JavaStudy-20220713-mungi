package j10_배열;

import j09_클래스.접근지정자.student.Student;

public class Array3 {  

	public static void main(String[] args) {
		/*
		 * names 배열 5개
		 * studentYears 배열 5개
		 * scoress 배열 5개
		 * 
		 * index 동일 학생 한명은 name도 0 studentYear도 0 score도 0 
		 */
		
		String[] names = {"박진관", "조문기", "서재효", "임나영", "전나경"};
		int[] studentYears = {3, 2, 4, 3, 4};
		double[] scores = {75.9, 80.5, 85.7, 88.3, 78.5};
		
//		for(int i = 0; i < 5; i++) {
//		System.out.println(names[i] + "\t" + studentYears[i] 
//				+ "학년\t" + scores[i] + "점"); //형식대로 출력
//		
//		}
		Student[] students = new Student[names.length];
		for(int i = 0; i < students.length; i++) {
		students[i] = new Student(names[i], studentYears[i], scores[i]);
		students[i].showStudentArray();
		}
		//null 이 아닌경우에만 실행하고 아니면 넘어가라~
		for(int i = 0; i < 1; i++) {
			if(students[i] != null) {
			System.out.println("이름: " + students[i].getName());
			// 질문: return 사용하면 안되나요?
			// 답변: return 사용하면 메소드 자체를 나가버려서 main 메소드를 나가게된다.
		}
		}
		
		  
		
		
	}

}
