package j10_클래스2.user;

import java.util.Scanner;

public class UserService {
	
	
	private Scanner scanner;
	private User[] userArray;
	
	//초기에는 이것이 생김!!!!!!!!!!!!!!!!!!!!!!11
//	public UserService(User[] userArray) {
//		
//	}  
	public UserService(User[] userArray) {
		this.userArray = userArray;
		this.scanner = new Scanner(System.in);
	}
	private User addUser() {
		for(int i = 0; i < userArray.length; i++) {
			if(userArray[i] != null) {
				continue;//비어있지 않으면 다음칸으로 넘어가라
			}
			userArray[i] = inputUser();  //비어있으면 user추가한다.
//먼저 inputUser가 만들어져 있어야 이렇게 짤 생각을 할 수 있을듯.?
			System.out.println("[" + userArray[i].getName() + "] 사용자 등록완료");
			return userArray[i];
//return에 아무것도 안넣어도 상관없지 않나?..
			
			
		}
		System.out.println("더이상 사용자를 등록할 수 없습니다.");
		return null;
	}
	public User inputUser() {
		String userName = null;
		String password = null;
		String name = null;
		String email = null;
		
		System.out.println("[유저등록]");
		System.out.println("id >> ");
		userName = scanner.nextLine();
		
		System.out.println("password >> ");
		password = scanner.nextLine();
		
		System.out.println("이름 >> ");
		name = scanner.nextLine();
		
		System.out.println("이메일 >> ");
		email = scanner.nextLine();
		
		new User(userName, password, name, email);
		
		return new User(userName, password, name, email);
	}
	public boolean showMainMenu() {
		String select = null;
		System.out.println("[사용자 등록 시스템]");
		System.out.println("1. 사용자 등록");
		System.out.println("2. 사용자 리스트 조회");
		System.out.println("q. 프로그램 종료");
		System.out.println("메뉴선택 >> ");
		
		select = scanner.nextLine();
		if(select.equals("1")) {
			User user = addUser();
			System.out.println();
		}else if(select.equals("2")) {
			
		}else if(select.equals("q")) {
			System.out.println("프로그램 종료중...");
			return false;
		}else {
			System.out.println("해당 메뉴는 선택 할 수 없습니다.");
			System.out.println("다시 입력하세요.");
		}
		System.out.println();
		return true;
		
	}
}
