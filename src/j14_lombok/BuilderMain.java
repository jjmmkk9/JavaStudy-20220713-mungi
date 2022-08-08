package j14_lombok;

public class BuilderMain {

	public static void main(String[] args) {
		Builder builder = new Builder();
		Car car = builder.builder()
		.company("기아")
		.model("k5")
		.color("화이트")
		.build();  //. . .찍어서 하려면 주소여야한다. 주소이려면 객체여야한다. 그렇기 때문에 . 할때 마다 주소를 리턴하게 만들어야한다.
		
		//얘가 빌더패턴의 원형
		Car car2 = new Car();
		car2.setCompany("현대"); 
		car2.setColor("블랙");

	}

}
