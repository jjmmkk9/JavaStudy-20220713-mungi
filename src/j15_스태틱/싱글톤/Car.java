package j15_스태틱.싱글톤;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class Car {
	private int carNumber;
	private String company;
	private String model;
}
