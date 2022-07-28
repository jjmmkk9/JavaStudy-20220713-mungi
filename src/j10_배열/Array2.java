package j10_배열;

public class Array2 {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
		numbers[5] = 6;
		numbers[6] = 7;
		numbers[7] = 8;
		numbers[8] = 9;
		numbers[9] = 10;
		// 이렇게 하나하나 안 넣어도됨 밑에처럼 중괄호 넣어서
		int[] numbers2 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		//  new int 생략가능
		int[] numbers3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		//
		int[] numbers4 = new int[1000];
		for(int i = 0; i < numbers4.length; i++) {
			numbers4[i] = i + 1; //numbers4에 값 대입
		}
		for(int i = 0; i < numbers4.length; i++) {
			System.out.println(numbers4[i]);
		}
		

	}

}
