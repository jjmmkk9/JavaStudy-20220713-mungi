package j20_예외처리;

public class ExceptionTest2 {
							//메소드에 예외 발생할 수 있다고 표시  -> 졸라편함
	public void printArray() throws Exception {
		int[] numArray = {1, 2, 3, 4, 5};
		
		
		if(0 == 0) throw new CustomException("내가 만든 예외 강제로 발생");
		
		for(int i = 0; i < 6; i++) {
			System.out.println(numArray[i]);
		}
		
	}
}
