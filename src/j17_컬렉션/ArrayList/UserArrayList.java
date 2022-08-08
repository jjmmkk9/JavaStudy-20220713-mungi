package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.Getter;

@Getter

public class UserArrayList {
	private List<User> userList;
	private Scanner scanner;
	
		//생성자 호출시에 객체 생성
		public UserArrayList() {
			userList = new ArrayList<User>();
			scanner = new Scanner(System.in);
		}
		
		public void addUser() {
			//입력
			String username = null;
			String password = null;
			String name = null;
			String email = null;
			
			System.out.print("아이디: ");
			username = scanner.nextLine();
			System.out.print("비밀번호: ");
			password = scanner.nextLine();
			System.out.print("이름: ");
			name = scanner.nextLine();
			System.out.print("이메일: ");
			email = scanner.nextLine();			
			//User객체 생성
			User user = User.builder()
					.username(username)
					.password(password)
					.name(name)
					.email(email)
					.build();
			//userList에 add하기
			userList.add(user);
		}
		public void printUserList(){
			//userList
			//toString쓰지 말고
			/*
			 * 아이디 > aaa
			 * 비밀번호 > 1234
			 * 이름 > 조문기
			 * 이메일 > aaa@naver.com
			 * 
			 * 아이디 > bbb
			 * 비밀번호 > 2222
			 * 이름 > 조문가
			 * 이메일 > bbb@naver.com
			 */
			for(int i = 0; i < userList.size(); i++) {  //뽀이치 써도된다
				System.out.println("아이디\t > " + userList.get(i).getUsername());
				System.out.println("비밀번호 > " + userList.get(i).getPassword());
				System.out.println("이름\t > " + userList.get(i).getName());
				System.out.println("이메일\t > " + userList.get(i).getEmail());
				System.out.println("-----------------------------");
				/* 
				 * 뽀이치
				 * for(User user : userList) {
				 * System.out.println("아이디\t > " + user.getUsername());
				 *	System.out.println("비밀번호 > " + user.getPassword());
				 *	System.out.println("이름\t > " + user.getName());
				 *	System.out.println("이메일\t > " + user.getEmail());
				 *	System.out.println("-----------------------------");
				 */
				
				
				
				
			}
			
		}
		
		public void removeUser() {  //뽀이치 사용 완료
			//아이디 입력
			String id = null;
			String password = null;
			System.out.print("아이디: ");
			id = scanner.nextLine();
			
			for(User user : userList) {
				if(id.equals(user.getUsername())) {
					System.out.print("비밀번호: ");
					password = scanner.nextLine();
					if(password.equals(user.getPassword())) {
					userList.remove(user);
					System.out.println("사용자 삭제 완료");
					return;
					}else {
						System.out.println("비밀번호가 일치하지 않습니다.");
						return;
					}
				
			}
			
		}
		}
		public static void main(String[] args) {
			UserArrayList userArrayList = new UserArrayList();
	
			while(true) {  //메뉴는 무한 반복 안에 들어있다. 
				String select = null;  //메뉴 입력을 받을 거니까 select 필요
			System.out.println("[ 사용자 관리 프로그램 ]");
			System.out.println("1. 사용자 추가");
			System.out.println("2. 사용자 리스트 출력");
			System.out.println("3. 사용자 삭제");
			System.out.println("q. 프로그램 종료");
			System.out.print("메뉴 선택 > ");
			System.out.println();
			select = userArrayList.getScanner().next();
			userArrayList.getScanner().nextLine();
			
			if(select.equals("1")) {
				userArrayList.addUser();
			}else if(select.equals("2")) {
				userArrayList.printUserList();
			}else if(select.equals("3")) {
				userArrayList.removeUser();
			}else if(select.equals("q")){
				System.out.println("프로그램 종료");
				break;  //q 입력하면 while끝내도록 break;
			}else {
				System.out.println("해당 번호는 사용할 수 없는 기능입니다.");
				System.out.println();
			}
		
		}	
		
		}

	}


