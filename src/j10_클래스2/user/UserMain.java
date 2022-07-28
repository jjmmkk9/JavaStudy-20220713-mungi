package j10_클래스2.user;

public class UserMain {
	/*
	 * 사용자 정보 시스템
	 * username(사용자 이름)
	 * password(비밀번호)
	 * name(이름)
	 * email(이메일)
	 * 
	 * User
	 * UserService
	 */
	public static void main(String[] args) {
		int userCount = 2;
		User[] userArray = new User[userCount]; 
		UserService service = new UserService(userArray);
						//userService에 아무것도 작성안되어있으면 빨간줄 뜨고
						// The constructor UserService(User[]) is un defined
						//그래서 create UserService(User[]) 누르면 
						//UserService에 뭐가 생김!!!!!!!!!!!!!!!!!!!
		while(service.showMainMenu()) {}
		System.out.println("프로그램 종료");
	}
}
