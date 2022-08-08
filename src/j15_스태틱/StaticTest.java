package j15_스태틱;
/*
 * static변수는 public
 * 
 * static 메소드 안에서는 static변수만 사용가능 
 * 
 */
public class StaticTest {
	
	public static String name;
	private int age;

	public static void printTest() {
		System.out.println("출력");
		System.out.println(name);	
	}
	public void printAge() {
		
	}
	
}
