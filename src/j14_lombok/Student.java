package j14_lombok;

import javax.annotation.processing.Generated;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//lombok이 전부 해줌..; lombok 짱..ㅜ
@NoArgsConstructor //기본 생성자
@AllArgsConstructor //전체생성자
@Setter
@Getter
@EqualsAndHashCode
@ToString
@Data
public class Student {
	private int studentCode;
	private String name;
	private int studentYear;
	private int age;
	
	
}
