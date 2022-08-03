package j03_연산자;

public class Operation4 {

	public static void main(String[] args) {
		
		int year = 990;
		String result = year % 4 == 0 
				&& (year % 100 != 0 || year % 400 == 0) ? "윤년" 
						: "윤년아님";
		
		System.out.println(result);
		
		System.out.println(year > 2000 ?  year + " 2000보다 큼" 
				: year > 1000 ? year + " 1000보다 큼" 
						: year > 500 ? year + " 500보다 큼" : year + " 500미만");

	}

}
