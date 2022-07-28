package j09_클래스.생성자;

public class Car {
	String company;
	String model;
	String color;
	
	public Car() {
		System.out.println("차생성");
	}

	public Car(String company, String model, String color) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
	}
	void showInfo() {
		System.out.println("회사명: " + company);
		System.out.println("모델명: " + model);
		System.out.println("색상: " + color);
		System.out.println();
	}
	
}
