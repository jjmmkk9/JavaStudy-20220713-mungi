package j05_입력;

import java.util.Scanner;

public class Input4 {

	public static void main(String[] args) {
		/*
		 * 이름을 입력해 주세요. (여러명 입력가능)
		 * 띄어쓰기로 구분
		 * 변수명 : names = 조문기 조문기 (nextLine) ~님, ~님 이렇게 출력
		 * 			phones = 9988 1916, 4717 8209  빼고 뒷자리만!!!! 010-1234-5678/010-2345-6789 이케 출ㄹ력
		 * 					
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		String names = null;
		String phones = null;
		
		System.out.print("이름을 입력해주세요: ");
		names = scanner.nextLine();
		
		System.out.print("전화번호를 입력해주세요: ");
		phones = scanner.nextLine();
		scanner.close();
		
		names = names.replaceAll(" ", "님, ") + "님";
		phones = phones.replaceAll(" ", "-")
				.replaceAll(",", "/010");
		
		System.out.println(names);
		System.out.println("010-" + phones);
		
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * String names = null;
		 * String phones = null;
		 * 
		 * System.out.print("이름을 입력해주세요: ");
		 * names = scanner.nextLine();
		 * System.out.print("전화번호를 입력해주세요: ");
		 * phones = scanner.nextLine();
		 * 
		 * names = names.replaceAll(" ", "님, ") + "님";
		 * phones = "010-" + phones.replaceAll(" ", "-")
		 * 						   .replaceAll(",", "/010");
		 * 
		 * System.out.println(names);
		 * System.out.println(phones);
		 * 
		 * 
		 */
	
		
	
		
		
	}

}
