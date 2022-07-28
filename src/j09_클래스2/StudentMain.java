package j09_클래스2;

public class StudentMain {
	public static void main(String[] args) {
		int studentCount = 2;
		Student[] studentArray = new Student[studentCount]; //학생 두명 담는 공간 주소를
		
		StudentService service = new StudentService(studentArray);	//service 생성할때 받음
		// 그럼 service에 가서 ---->
		
		
			//while 조건이 메소드 select에서 입력받아서 원하는 메뉴 선택
		while(service.showMainMenu()) {}
		System.out.println("프로그램 종료");
		
	}
}
