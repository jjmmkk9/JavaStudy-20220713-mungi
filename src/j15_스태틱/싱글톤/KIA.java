package j15_스태틱.싱글톤;
	/*
	 * 싱글톤이란
	 * 유일한 객체!!를 만들어서 공유하는 생성패턴
	 * 기아 본사는 하나만 있음: 유일해야함
	 * 
	 * 1. 생성자는 접근지정자가 private이다.  -> 외부에서 호출이 안됨;
	 * 		- 외부에서 생성하지 않고 기능을 쓰려면 Static method 
	 * 		- 싱글톤을 안쓰면 전부다 static을 넣어줘야지만 싱글톤처럼 쓸 수 있다. 
	 * 2. 자기 자신의 유일한 객체를 담을 수 있는 instance라는 
	 * 		변수명을가진 스태틱 변수가 필요하다. 
	 * 3. instance 변수를 리턴(공유)해줄 getInstance 스태틱 메소드가 필요하다. 
	 */
public class KIA {
	private static KIA instance;  //자기 자신의 객체를 만들어
	
	private Car[] carArray;
	private int autoCode;
	
	private KIA() {
		carArray = new Car[10];
		autoCode = 20220000;
	}
	
	public static KIA getInstance() {
		if(instance == null) {
			instance = new KIA();  //instance를 딱 한번만 생성하게
		}							//instance는 static이니까 다음번에 호출됐을 때 null일 수가 없다.  => KIA는 유일한 객체
		return instance;
	}
	
	public Car produceCar(String model) {
		int carNumber = ++autoCode;
		String company = getClass().getSimpleName();
		
//		Car car = new Car(carNumber, company, model);
		Car car = Car.builder()
				.carNumber(carNumber)
				.company(company)
				.model(model)
				.build();
		
		if(addCar(car)) {
			return car;
		}
		return null;
	}
	
	private boolean addCar(Car car) {
		for( int i = 0; i < carArray.length; i++) {
			if(carArray[i] == null) {
				carArray[i] = car;
				System.out.println("배열에 차량 추가 완료");
				return true;
			}
		}
		System.out.println("배열에 공간이 없습니다.");
		return false;
		
	}

}
