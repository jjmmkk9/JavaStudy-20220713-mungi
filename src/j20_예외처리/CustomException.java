package j20_예외처리;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.NonFinal;

/*
 * 예외 만들기~~
 * extends RuntimeException 하면 예외 만들기 가능
 */


@NoArgsConstructor
public class CustomException extends RuntimeException{
	/**
	 * 노란줄 떠서 클릭했더니 나옴
	 *  + add default serial Version ID
	 */
	private static final long serialVersionUID = 1L;
	
	private String errorMessage;
	
	
	public CustomException(String errorMessage) {
		super(errorMessage);  //runtrimeException에 errorMessage 전달
		this.errorMessage = errorMessage;
	}
	
	
	@Override
	public void printStackTrace() {
		System.out.println("우리가 만든 예외가 발생하였습니다.");
		System.out.println("메세지 내용은 아래를 참고하세요.");
		super.printStackTrace();
	}
	
	
	
	
	
}
