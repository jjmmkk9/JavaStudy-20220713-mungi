package j09_클래스;

public class CarMain {

	/*
	 * 클래스: car
	 * 변수: company
	 * 		model
	 * 		color
	 * 메소드
	 * 		showCarInfo()
	 * 			회사명: 000
	 * 			모델명: 000
	 * 			색상: 000
	 * 3대 
	 * 	현대자동차 쏘나타 화이트
	 * 	기아 k5 블랙
	 * 	현대자동차 아반떼 그레이
	 */
	public static void main(String[] args) {
		System.out.println((new Car()).toString());
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		car1.color = "화이트";
		car1.company = "현대자동차";
		car1.model = "쏘나타";
		
		car2.color = "블랙";
		car2.company = "기아";
		car2.model = "k5";
		
		car3.color = "그레이";
		car3.company = "현대자동차";
		car3.model = "아반떼";
		
		car1.showCarInfo();
		car2.showCarInfo();
		car3.showCarInfo();
		
		
		
	}

}
