package j07_반복;

public class While4 {

	public static void main(String[] args) {

		
		int i = 0;
		int j = 0;
		
		while(i < 8) {
			int dan = i + 2;
			System.out.println(dan + "단");
		
		while(j < 9) {
			int num = j + 1;
			System.out.println(dan + " x " + num + " = " + (dan * num));
			j++;
			
		}
		i++;
		j = 0;
	}
}
}
