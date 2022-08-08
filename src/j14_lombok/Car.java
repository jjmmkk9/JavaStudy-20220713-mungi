package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Car {
	private String company;
	private String model;
	private String color;
	
	
	//flag는~ 입니다.    -> 이게 뭔데 
//	public Car(String company) {//, int flag) 
//		
//	}
//	public Car(String model) {
//	
// }	
}
