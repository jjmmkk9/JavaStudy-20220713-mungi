package j16_제네릭;

import j14_lombok.Car;
//이거 다시 듣기
public class CMRespMain {

	public static void main(String[] args) {
		//요청: 자동차를 한대 생성해줘
		Car car = Car.builder()
				.company("현대")
				.model("k3")
				.color("화이트")
				.build();
		
		CMRespDto<Car> cmRespDto1 = new CMRespDto<Car>(1, "차량생성 완료", car);
		System.out.println("응답결과: " + cmRespDto1);
		
		//해당 자동차가 현대자동차인지 확인해줘
		CMRespDto<?> cmRespDto2 = null;
		
		if(car.getCompany().equals("현대")) {
			cmRespDto2 = new CMRespDto<Car>(1, "현대 자동차 맞음", car);
		}else {
			cmRespDto2 = new CMRespDto<Boolean>(-1, "현대 자동차 아님", false);
			
		}
		System.out.println("응답결과: " + cmRespDto2);
	}

}
