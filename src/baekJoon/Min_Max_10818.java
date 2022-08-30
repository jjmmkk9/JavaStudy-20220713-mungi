package baekJoon;

import java.util.Arrays;
//import java.util.Random;
import java.util.Scanner;
/*
 * 틀렸음
 * 뒤에 정수 내가 입력하는 거였음
 * 랜덤 클래스 필요없음., ㅡㅡ
 */
public class Min_Max_10818 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		Random random = new Random();
		int num = scanner.nextInt();
//		
//		int[] numArray = new int[num];
//		int max = 0;
//		int min = 0;
//		
//		for(int i  = 0; i  < numArray.length; i++) {
//			numArray[i] = random.nextInt(1000000);
//			System.out.print(numArray[i] + " ");
//			
//			while(i == 0) {
//				max = numArray[i];
//				min = numArray[i];
//				break;
//			}
//			if(max < numArray[i]) {
//				max = numArray[i];
//			}
//			if(min > numArray[i]) {
//				min = numArray[i];
//			}
//		
//
//	}
//		System.out.println();
//		System.out.print(max + " " + min);

		int[] numArray = new int[num];
		for(int i = 0; i < num ; i++) {
			numArray[i] = scanner.nextInt();
		}
		Arrays.sort(numArray);
		System.out.println(numArray[0] + " " + numArray[num - 1]);
		
		
		
		
}
}
