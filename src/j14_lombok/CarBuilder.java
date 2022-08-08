package j14_lombok;

public abstract class CarBuilder {
	protected Car car; 
	//Car를 protected 처리 -> 동일 패키지에서만 접촉 가능
	
	public Car build() { //제일 마지막에 Set으로 다 만들어둔 
		return car;		//car객체를 리턴
	}
	public CarBuilder builder() {  	//1. 얘가 스타트 builder 가 호출 되면 
		car = new Car();  			//2. Car를 생성
		return this;  				//3. CarBuilder 자기자신을 리턴  그럼 CarBuilder. 찍고 참조할수 있게 된대
	
	}
	
	public abstract CarBuilder company(String company);  //추상메소드로 만들어서 상속해서 재정의하도록
	public abstract CarBuilder model(String model);
	public abstract CarBuilder color(String color);
}
