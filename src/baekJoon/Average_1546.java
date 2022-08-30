package baekJoon;

import java.util.Arrays;
import java.util.Scanner;
/*
 * Arrays 메소드들 사용하기
 */

public class Average_1546 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double[] arr = new double[scanner.nextInt()];
		double sum = 0.0;
		
		for(int i  = 0; i < arr.length; i++) {
			arr[i] = scanner.nextDouble();
			
		}
		Arrays.sort(arr);  //배열 정렬
		
		for(int i = 0 ; i < arr.length ; i++) {
			sum += ((arr[i]/arr[arr.length - 1]) * 100);
			System.out.println();
		}
		
		System.out.println(sum/arr.length);
		
		
	}

}
