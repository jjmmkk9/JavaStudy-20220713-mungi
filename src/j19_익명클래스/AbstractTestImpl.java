package j19_익명클래스;
/*
 * 이 클래스를 딱 한번만 쓰고 안쓸거면 이렇게 만들어줄 
 * 필요가 없다. 그래서 main에서
 */

public class AbstractTestImpl extends AbstractTest{

	@Override
	public void showData(String data) {
	System.out.println("data: " + data);
		
	}

	@Override
	public void add(int num1, int num2) {
		System.out.println("num1 + num2 = " + (num1 + num2));
	}

}
