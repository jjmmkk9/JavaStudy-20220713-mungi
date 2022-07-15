package j02_변수와상수;

public class Cast {

	public static void main(String[] args) {
		char a = '가';
		int b = a;
		double c = b;
		/* int 와 double에서 10진수, 실수로 변환됨 */
		
		System.out.println(b);
		System.out.println(c);
		
		int d = (int) c;
		System.out.println(d);
		
		char e = (char) d;
		System.out.println(e);
		
	}

}
