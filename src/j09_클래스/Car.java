package j09_클래스;

public class Car {
	String company;
	String model;
	String color;
	
	public Car() { //생성자는 무조건 클래스이름과 동일하게됨
		//생성자는 무조건 주소값을 리턴한다 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//그래서 생성할때 참조변수에 담을 수 있는 것
	System.out.println("Car 생성자 호출");
	}
	
	void showCarInfo() {
		System.out.println("회사명: " + company);
		System.out.println("모델명: " + model);
		System.out.println("색상: " + color);
		System.out.println();
	}
}
