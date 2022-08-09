package j20_예외처리;

public class ExceptionTest2Main {
	/*
	 * ExceptionTest2에서 만든 메소드에다가 throws Exception 붙여서 테스트
	 */
	public static void main(String[] args) {  
		ExceptionTest2 exceptionTest2 = new ExceptionTest2();
		
		try {
			exceptionTest2.printArray();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램 종료");
	}
		
	
}
