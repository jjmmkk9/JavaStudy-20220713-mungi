package j07_반복;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("반복 횟수 입력: ");
		int n = scanner.nextInt();

		int i = 0;
		while(i < n) {
			System.out.println("i = " + (i + 1));
			i++;
		}
		System.out.println();

		i = 0;

		while(i < n) {
			System.out.println("i = " + (n - i));
			i++;

		}

	}
}
