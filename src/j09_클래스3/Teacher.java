package j09_클래스3;

public class Teacher extends Person{
	private String subject;
	private int teacherCode;
	

	public Teacher(String name, int age, String subject, int teacherCode) {
		super(name, age);
		this.subject = subject;
		this.teacherCode = teacherCode;
	}

	//get set
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getTeacherCode() {
		return teacherCode;
	}

	public void setTeacherCode(int teacherCode) {
		this.teacherCode = teacherCode;
	}
	
	

	@Override
	public String toString() {
		return super.toString() + ", Teacher [subject=" + subject + ", teacherCode=" + teacherCode + "]";
	}		//super.toString() + ~~

	@Override
	public String mealTime() {
		
		return "점심시간 10분 전";
	}
	
	
}
