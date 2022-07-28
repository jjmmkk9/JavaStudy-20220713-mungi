package j09_클래스.접근지정자;

import j09_클래스.접근지정자.a.TestA_2;
import j09_클래스.접근지정자.b.TestB;

public class AccessModifierMain {

	public static void main(String[] args) {
		TestA_2 testA2 = new TestA_2();  //생성자 호출은 가능하다 기본적으로 public이기 땜에
		testA2.testA2(); //test 메소드 호출은 안됨
		
		TestB testB = new TestB();
		System.out.println(testB.getTb());

	}

}
