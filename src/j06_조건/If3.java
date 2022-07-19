package j06_조건;

public class If3 {

	public static void main(String[] args) {
		
		int x = -1;
		int y = 0;
		String result = null;
		
		if(x == 0 || y == 0) {
			result = "0";
		}else if(x > 0 && y > 0) {
			result = "1사분면";
		}else if(x > 0 && y < 0) {
			result = "4사분면";
		}else if(x < 0 && y < 0) {
			result = "3사분면";
		}else {
			result = "2사분면";
		}
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("결과: " + result);
	}

}
