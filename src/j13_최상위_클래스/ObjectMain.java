package j13_최상위_클래스;

public class ObjectMain {

	public static void main(String[] args) {
		Object object = new Object();
		
		Object test = new Test();  //업캐스팅이 되는 상황 -> 상속받거나 구현하거나
									// : 우리가 아는 모든 객체들은 Object 클래스를 상속받는다. 
									//	생략된 것일 뿐
		Test testMethod = new Test();

	}

}
