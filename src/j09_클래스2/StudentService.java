package j09_클래스2;

import java.util.Scanner;

public class StudentService {

	private Scanner scanner;
	private Student[] studentArray; // 여기에 Main에 주소값이 들어와서...??

	public StudentService(Student[] studentArray) {
		this.studentArray = studentArray;
		this.scanner = new Scanner(System.in);
	}
	
	// 메뉴가 많을 거니까 계속 쓸거니까 메소드로 빼
	private String inputSelect() {
		System.out.println("메뉴선택 >> ");
		return scanner.nextLine();
	}

	
	private void printSelectErrorMessage() {
		System.out.println("해당 메뉴는 선택 할 수 없습니다.");
		System.out.println("다시 입력하세요.");
	}
	// 중복코드 줄이려고 메소드로 묶은 친구들

	public boolean showMainMenu() {
		String select = null;
		System.out.println("[학생 등록 시스템]");
		System.out.println("1. 학생 등록");
		System.out.println("2. 학생 리스트 조회");
		System.out.println("q. 프로그램 종료");

		select = inputSelect();

		if (select.equals("1")) {
			Student student = addStudent();
			if (student != null) {
				System.out.println(student.toString());
			}
		} else if (select.equals("2")) {
			while (showStudentSearch()) {
			}

		} else if (select.equals("q")) {
			System.out.println("프로그램 종료중...");
			return false; // 메소드 반환자료형이 boolean인데 여기서 false로 반환된다. 그럼
							// Main에서 while의 조건이 false됨 =>종료
		} else {
			printSelectErrorMessage();
		}
		System.out.println();
		return true; // => 1번, 2번 그리고 나머지는 전부 while조건에 true 반환
						// 그래서 계속 반복
	}

	private Student addStudent() {
		// 배열의 끝에 학생을 계속 추가해줘야한다.
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i] != null) {
				continue; // 비어있지 않으면 다음으로 넘어가라
			}
			studentArray[i] = inputStudent();
			System.out.println("[" + studentArray[i].getStudentName() + "] 학생 등록 완료");
			// 학생 등록완료 됐을 땐 return 걸어야 반복문도 빠져나가면서 밑에 학생을 등록할수
			// 없습니다. 출력되면 안되니까 메소드도 빠져나가야한다.
			return studentArray[i];

		}
		System.out.println("더이상 학생을 등록할 수 없습니다.");
		return null;
	}

	public Student inputStudent() { // Student가 리턴자료형 => 학생 한명의 객체 주소를 리턴
		// 메소드 안에서만 사용하는 지역변수
		String studentName = null;
		int studentYear = 0;
		String studentAddress = null;
		String studentPhone = null;

		System.out.println("[학생등록]");
		System.out.println("이름 >> ");
		studentName = scanner.nextLine();

		System.out.println("학년 >> ");
		studentYear = scanner.nextInt();
		scanner.nextLine();

		System.out.println("주소 >> ");
		studentAddress = scanner.nextLine();

		System.out.println("연락처 >> ");
		studentPhone = scanner.nextLine();

		new Student(studentName, studentYear, studentAddress, studentPhone);

		return new Student(studentName, studentYear, studentAddress, studentPhone);

	}

	private boolean showStudentSearch() {
		String select = null;
		System.out.println("[학생 리스트 조회]");
		System.out.println("1. 학생 전체 조회");
		System.out.println("2. 이름으로 검색");
		System.out.println("b. 뒤로가기");

		select = inputSelect();
		if (select.equals("1")) {
			showStudentList();
		} else if (select.equals("2")) {
			while (showStudentSearch()) {
			}

		} else if (select.equals("b")) {
			System.out.println("이전 메뉴로 돌아갑니다.");
			return false;
		} else {
			printSelectErrorMessage();
		}
		System.out.println();

		return true;
	}

	private void showStudentList() {
		System.out.println("[학생 전체 조회]");
		System.out.println("이름\t\t학년\t\t주소\t\t연락처");
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i] != null) {
				System.out.println(studentArray[i].getStudentName() + "\t\t" + studentArray[i].getStudentYear() + "\t\t"
						+ studentArray[i].getStudentAddress() + "\t\t" + studentArray[i].getStudentPhone());

			}
		}
		System.out.println();
	}

	private void showSearchStudent() {
		String searchName = null;
		System.out.println("[학생 이름으로 검색]");
		System.out.println("이름 >> ");
		searchName = scanner.nextLine();

		Student searchStudent = searchStudentByStudentName(searchName);
		if (searchStudent != null) {
			if (searchStudent != null) {
			}
		}

	}

	private Student searchStudentByStudentName(String searchName) {
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i] != null) {
				String studentName = studentArray[i].getStudentName();
				if (searchName.equals(studentName)) {
					return studentArray[i];
				}
			}
		}
		System.out.println("해당 이름의 학생은 존재하지 않습니다.");
		return null;
	}
}
