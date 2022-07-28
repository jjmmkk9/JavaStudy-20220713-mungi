package j09_클래스.접근지정자.student;

public class Student {
	//앞으로 모든 변수는 프라이빗!!!!!!!!!!!! 무족곤 무족곤
	private String name;
	private int studentYear;
	private int age;
	private String address;
	private String phone;
	private double score;
	
	public Student() {}
	
	//private 변수에 값을 주입하는 방법 
	//1[생성자를 통한 값 주입]
	public Student(String name, int studentYear, int age, String address, String phone) {
		super();
		this.name = name;
		this.studentYear = studentYear;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}
	
	
	public Student(String name, int studentYear, double score) {
		super();
		this.name = name;
		this.studentYear = studentYear;
		this.score = score;
	}

	//2[Setter를 통한 값 주입]
	//setter는 값만 주입하기 때문에 return없음
		public void setName(String name) {
			this.name = name;
			
		}
		
	//private 변수의 값을 이제 외부에서 가져오는 법
		public String getName() {
			return name;
		}

		public int getStudentYear() {
			return studentYear;
		}

		public void setStudentYear(int studentYear) {
			this.studentYear = studentYear;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}
		
		public void showStudentArray() {
			System.out.println(name + " " +  studentYear + " " +score);
		}
		
	}

	
	
