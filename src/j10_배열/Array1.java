package j10_배열;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		//정수 배열[]
		
		int[] numbers = new int[5];
					//생성하면 주소값이 생김 -> 이 배열을 묶은 주소값을 넣겠다.
		//문자열 배열
		String[] strArray = new String[5];
		//객체 배열
		Scanner[] scanArray = new Scanner[5];

		/*
		 * 배열에 값추가
		 */
		numbers[0] = 10;
		numbers[1] = 20;
		
		strArray[4] = "문자열";
		
		scanArray[0] = new Scanner(System.in); //스캐너 객체하나 생성해서 집어너준거
		
		
		
	}

}
