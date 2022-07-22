package j08_메소드;

public class Method4 {
	/*
	 * 메소드 오버로딩 매개변수의 형태가 다르면 동일한 메소드명을 사용해서 메소드를 정의할 수 있다. 먼소리임
	 * 
	 */
	public static int add(int a, int b) {
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println();
		return a + b;
	}
	public static int add(int a, int b, int c) {
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println();
		return a + b + c;
	}
	public static void main(String[] args) {

		System.out.println(add(1, 2, 3));
		System.out.println();
		System.out.println(add(1, 2));
		
	}

}
