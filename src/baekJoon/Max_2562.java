package baekJoon;

import java.util.Scanner;

public class Max_2562 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] arr = { in.nextInt(), in.nextInt(), in.nextInt(),
				in.nextInt(), in.nextInt(), in.nextInt(),
				in.nextInt(), in.nextInt(), in.nextInt() };
		in.close();
		
		int max  = 0;
		int index = 0;
		int count = 0;
		
		for(int value : arr) {
			count++;  //1부터 시작
            
			if(value > max) {
				max = value;
				index = count;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
		
		

	}

}
