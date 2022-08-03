package j02_변수와상수;

public class Constant {

	public static void main(String[] args) {
		final int MAX_NUMBER = 100;
		final int MIN_NUMBER = 0;
		/* 맥스값과 민값은 변하면 안된다 그래서 >>final<< int 로 선언 
		 * 그리고 상수는 전부 대문자로 해준다 
		 * 상수는 보통 기준이 되는 값이나 경로같이 변하면 안되는 값은 상수로! 
		 * 초기화가 될 수 없는 값이 상수*/
		
		int number = 10;
		System.out.println(number);
		number = 20; 
		System.out.println(number);
		number = 30;
//		System.out.println("최소값: " + MIN_NUMBER);
//		System.out.println("최대값: " + MAX_NUMBER);
		System.out.println("현재값: " + number );
		System.out.println();

	}

}
