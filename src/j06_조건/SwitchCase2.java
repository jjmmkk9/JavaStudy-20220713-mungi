package j06_조건;

public class SwitchCase2 {

	public static void main(String[] args) {
		
		int score = 100;  //근데 100점 넘는 104점 이런거 입력됨
		boolean breakFlag = true;
		
		switch(score / 10) {
		case 10:
		case 9:
			System.out.println("A");
			if(breakFlag) {
			break;
			}
		case 8:
			System.out.println("B");
			if(breakFlag) {
				break;
				}
		case 7:
			System.out.println("C");
			if(breakFlag) {
				break;
				}
		case 6:
			System.out.println("D");
			if(breakFlag) {
				break;
				}
		default:
				System.out.println("F");
		}

	}

}
