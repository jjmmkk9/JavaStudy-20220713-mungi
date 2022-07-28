package j09_클래스.접근지정자.a;

public class TestA_2 {		
	int ta2;
	
	public void testA2() {
		System.out.println("testA2 메소드 호출");
		System.out.println();
		
		TestA testA = new TestA();  //생성은 꼭 메인에서 할 필요 없다 
									//메소드 안이면 어디든 가능
		testA.ta1 ="테스트A2에서 값 주입";
		testA.testA1();
		System.out.println(testA.ta1);
	}

}
