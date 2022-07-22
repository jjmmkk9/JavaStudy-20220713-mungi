package j08_메소드;

import java.util.Scanner;

public class Method2 {
	/*
	 * 반환자료형
	 * 리턴자료형
	 * 
	 * 반환값 
	 * 리턴값
	 * 
	 * 파라미터
	 * 매개변수
	 * 
	 * 메소드(함수) 정의
	 * 메소드(함수) 호출(콜)
	 */
	
	//test1은 반환도 없도 매개변수도 없는 메소드  --> 실행용 메소드
	public static void test1() {
		System.out.println("test1 메소드 호출");
	}
	//test2는 반환이 없고 매개변수가 하나인 메소드
	public static void test2(int num) {
		System.out.println("test2 메소드 호출");
		System.out.println("num: " + num);
	}
	//test3 반환이 없고 매개변수가 두개인 메소드
	public static void test3(int num, int num2) {
		System.out.println("test3 메소드 호출");
		System.out.println("num: " + num);
		System.out.println("num2: " + num2);
	}
	
	//test4 반환은 있고 매개변수가 없는 메소드  ---> 이런형태는 잘 쓰지 않는다. 왜냐면 그냥 100을 리턴하니까
	public static int test4() {
		System.out.println("test4 메소드 호출");
		return 100;
	}
	public static Scanner test04() {
		System.out.println("test4 메소드 호출");
		return new Scanner(System.in);
	}
	//반환도 있고 매개변수도 있는 메소드
	public static String test5(String name, int index) {
		System.out.println("name: " + name);
		System.out.println("index: " + index);
		return name + index;
	}
	
	//반환값이 없는 메소드에서 메소드를 강제로 탈출하는 방법
	public static void test6(String names) {
		while(true) {
		int tokenIndex = names.indexOf(", ");
		String name = tokenIndex != -1 ? names.substring(0, tokenIndex)
				:names;
		System.out.println(name);
		
		if(name.equals("김준삼")) {
			return;  // 만약 김준삼 찾으면 반복도 종료하고 메소드 자체를 중지
					// break도 사용가능 근데 break는 반복만 멈춰줌 나머지는 실행 된다.
		}
		if(tokenIndex == -1 ) {
			break;
		}
		names = names.substring(tokenIndex + 2);
		}
		System.out.println("메소드가 정상적으로 종료되었음.");
	}
	public static void main(String[] args) {
		test1();
		test1();
		test1();
		System.out.println();
		test2(1234);
		System.out.println();
		test3(1111, 2222);
		System.out.println();
		
		int a = test4(); //a에 tese4가 대입될수 있는 이유는 test4의 리턴 값이 정수 이기 때문에
		System.out.println(a);
		System.out.println(test4());
		System.out.println();
		
		String result = test5("김준일", 1);
		System.out.println(result);
		System.out.println(result);
		System.out.println(result);
		
		System.out.println();
		
		String names = "김준일, 김준이, 김준삼, 김준사";
		test6(names);
		System.out.println("test6메소드 호출 후 출력");
		
	}

}
