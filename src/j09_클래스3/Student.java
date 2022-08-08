package j09_클래스3;

public class Student extends Person{
					//상속은 person이 가진 private 빼고 모든걸 자식이 가짐
	private String schoolName;
	private int studentCode;
	private int studentYear;
	

//	public Student(String schoolName, int studentCode, int studentYear) {
//		super(); 
//		this.schoolName = schoolName;
//		this.studentCode = studentCode;
//		this.studentYear = studentYear;
//	}
	 
	//생성자로 학생 객체를 생성하면 
	public Student(String name, int age, String schoolName, int studentCode, int studentYear) {
		super(name, age); //부모인 Person도 같이 생성된다. 부모 변수도 생성자에 같이 보내줘야한다. 
		this.schoolName = schoolName;
		this.studentCode = studentCode;
		this.studentYear = studentYear;
	}
	//get set
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(int studentCode) {
		this.studentCode = studentCode;
	}

	public int getStudentYear() {
		return studentYear;
	}

	public void setStudentYear(int studentYear) {
		this.studentYear = studentYear;
	}

	@Override
	public String toString() {
		return super.toString() + ", Student [schoolName=" + schoolName + ", studentCode=" + studentCode + ", studentYear=" + studentYear
				+ "]";
	}
	@Override
	public String mealTime() {

		return "점심시간";
	}
	 
	 
	
}
