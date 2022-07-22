package j07_반복.랜덤;

import java.util.Random;

public class Random3 {

	public static void main(String[] args) {

		Random random = new Random();

		int i = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int max = 0;

		while (i < 20) {
			a = random.nextInt(50);
			b = random.nextInt(50);
			c = random.nextInt(50);
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("c = " + c);
			//4 5 6 max=3
			if(a > b && max < a) { //a > b이고 max가 a보다 작으면
				max = a;  	//max 재정의
				
			}else if(max < b) { //max b보다 작으면
				max = b;	//max 재정의
			} 				//a랑 b max 비교 끝
			
			if(max < c) {  //비교 끝난 max가 c보다도 작으면 
				max = c;	//max 재정의
			}
							//c보다 크면 a or b max 값 가지고 다시 반복
			System.out.println("max = " + max);
			i++;
		}
		
			
//				if (a > b || a > c) {
//					if(max < a) {
//					max = a;
//				}
//				}
//				if (b > a || b > c) {
//					if(max < b) {
//					max = b;
//
//				}
//				}
//				if (c > a || c > b) {
//					if(max < c) {
//					max = c;
//
//				}
//				}
				
		System.out.println("최대값: " + max);

	}

}
