package j05_입력;

import java.util.Scanner;

public class Input1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		//변수 선언이 중간중간 되면 안좋은 코드
		//그래서 위에서 null 값으로 선언해주고 밑에서 초기화 대입!!
		String str = null;
		String str2 = null;
		int num1 = 0;
		
		System.out.print("내용을 입력하세요: ");
		str = scanner.nextLine(); 
		System.out.print("내용을 입력하세요: ");
		str2 = scanner.nextLine();
		System.out.print("정수를 입력하세요: ");
		num1 = scanner.nextInt();
				
		
		System.out.println("출력: " + str);
		System.out.println("출력2: " + str2);
		System.out.println("출력3: " + num1);
		
		
	}

}
