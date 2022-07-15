package j03_연산자;

public class Operation3 {

	public static void main(String[] args) {
		int result = 10;
		
		//나 자신한테 10을 더 더하고 싶다
		result = result + 10;   //20
		
		result += 20; 			//40
		result *=2;				//80
		result -=10;			//70
		result /=2;				//35
		result %=10;			//5
		
		System.out.println(result);

	}

}
