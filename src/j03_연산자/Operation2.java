package j03_연산자;

/*
 * 논리연산
 */
public class Operation2 {

	public static void main(String[] args) {
		// 연산은 결과가 있다!
		boolean result = 10 != 5;
		boolean result2 = 10 == 10;
		
		System.out.println(result);
		System.out.println(10 == 9);
		
		// boolean끼리 연산이 된다?? => 논리연산!
		System.out.println("" + result + result2);
		
		System.out.println(2000 % 4 == 0 && 2000 % 100 != 0 && 2000 % 5 == 0);
						// true          &&  false          &&  true   =>false
	}

}
