package baekJoon;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		Random random = new Random();
		
		for(int i = 0; i < 5; i++) {
			
		for(int j = 0;  j < 6 ; j++) {
			System.out.print("[" + (random.nextInt(45) + 1) + "]" );
		}
		System.out.println();
		}

	}

}
