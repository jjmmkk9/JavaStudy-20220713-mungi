package j17_컬렉션.ArrayList.복습;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.Getter;

@Getter
public class UserArrayList {
	private Scanner scanner;
	private List<User> userList;

	public UserArrayList() { // 생성될때 리스트가 만들어지고, 스캐너가 만들어짐
		userList = new ArrayList<User>();
		scanner = new Scanner(System.in);
	}

	public void addUser() {
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

		// User객체 생성 (빌더로)
		User user = User.builder()
				.username(username)
				.password(password)
				.name(name)
				.email(email)
				.build();
		// list<User>에 저장
		userList.add(user);

	}

	public void printUser() {
		for (User user : userList) {
			System.out.println("아이디 \t> " + user.getUsername());
			System.out.println("비밀번호> " + user.getPassword());
			System.out.println("이름 \t> " + user.getName());
			System.out.println("이메일 \t> " + user.getEmail());
			System.out.println("---------------------------");
		}
	}

	public void removeUser() {
		String id = null;
		String password = null;

		System.out.print("삭제할 아이디: ");
		id = scanner.nextLine();

		for (User user : userList) {
			if (id.equals(user.getUsername())) {
				System.out.print("비밀번호 입력: ");
				password = scanner.nextLine();
				if (password.equals(user.getPassword())) {
					userList.remove(user);
					System.out.println("사용자 삭제 완료");
					return;
				} else {
					System.out.println("비밀번호가 틀렸습니다.");
					System.out.println("사용자 삭제 실패");
				}

			} else {
				System.out.println("아이디가 존재 하지 않습니다.");
				System.out.println("사용자 삭제 실패");
			}

		}
	}

	public static void main(String[] args) {
		UserArrayList list = new UserArrayList();

		while (true) {
			String select = null;
			System.out.println("\n[ 사용자 관리 프로그램 ]");
			System.out.println("1. 사용자 추가");
			System.out.println("2. 사용자 리스트 출력");
			System.out.println("3. 사용자 삭제");
			System.out.println("q. 프로그램 종료");
			System.out.print("메뉴 선택 >> ");
			select = list.getScanner().next();
			list.getScanner().nextLine();
			System.out.println();

			if (select.equals("1")) {
				list.addUser();
			} else if (select.equals("2")) {
				list.printUser();
			} else if (select.equals("3")) {
				list.removeUser();
			} else if (select.equals("q")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("사용할 수 없는 메뉴입니다.");
				System.out.println();
			}
		}

	}
}
