package j02_변수와상수;

public class Cast {

	public static void main(String[] args) {
		char a = '황';  //문자
		int b = a;  //정수
		double c = b;  //실수
		/* int 와 double에서 10진수, 실수로 변환됨 */
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int d = (int) c;  //업캐스팅 = 묵시적 형변환   다운캐스팅 = 명시적 형변환 
		System.out.println(d);
		
		char e = (char) d;
		System.out.println(e);
		
	}

}
