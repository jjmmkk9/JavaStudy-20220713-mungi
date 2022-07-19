package j06_조건;

public class SwitchCase {

	public static void main(String[] args) {
		
		String select = "10";
		switch(select) {
		case "10":
			System.out.println("10입니다.");
			System.out.println("10입니다.");
			break;
		case "20":
			System.out.println("20입니다.");
			break;
		case "30":
			System.out.println("30입니다.");
			break;
		case "40":
			System.out.println("40입니다.");	
			break;
		default:
			System.out.println("그 외에 실행");
			}

	}

}
