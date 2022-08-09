package j20_예외처리;

import javax.management.BadAttributeValueExpException;

public class ExceptionTest1 {

	/*
	 * 예외 처리 =>
		 * try {
		 * 오류가 발생할 지점
		 * }catch (예외이름 e) {
		 * 발생시 처리문;
		 * }catch (또 다른 예외)
		 */
	public static void main(String[] args) {
		int[] numArray = {1, 2, 3, 4, 5};
		
									// 반복 크기를 +1 늘리면 예외 발생
		for(int i =  0; i < numArray.length; i++) {
			
			try {
			System.out.println(numArray[i]);  //여기서 오류 뜨고
			
			if(1 == 1) throw new BadAttributeValueExpException(null); // throw는 강제적 예외 생성 
			System.out.println("예외 이후에 정의된 실행문"); //예외가 나오면 예외 이후 실행문 안나오고 바로 catch로 이동
			
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("비상 비상 >> 배열 범위 초과 <<");
				
			}catch (NullPointerException e) {
					System.out.println("비상 비상 >> 값이 비었음 <<");	
					
				//Exception 은 모든 예외를 받음
			}catch(Exception e) {
				System.out.println("무슨 예외인지 모르겠지만 예외 발생하면 무조건 처리");
				e.printStackTrace();  // -> 예외 정보 출력
				
			}finally {  //지금까지 작성한거 저장할 수 있게 
				System.out.println("예외 발생하든 안하든 무조건 실행되는 finally");
			}
		}
		System.out.println("프로그램 종료 되는지 확인");  //try catch 해주니 프로그램 종료 안됨.

	}

}
