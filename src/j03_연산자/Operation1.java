package j03_연산자;

public class Operation1 {

	public static void main(String[] args) {

		int num = 50;			  /* 기대 */ /* 실제 */
		System.out.println(++num); /* 51 */  /* 51  */
		System.out.println(num);   /* 51 */  /* 51 */
		System.out.println(num++); /* 52 */  /* 51 */
		System.out.println(num);   /* 52 */  /* 52 */
		
		
		System.out.println(--num); /* 51 */
		System.out.println(num);   /* 51 */
		System.out.println(num--); /* 51 */
		System.out.println(num);   /* 50 */
	}

}
