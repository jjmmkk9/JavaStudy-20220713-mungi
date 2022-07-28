package j10_배열;

public class Array4 {

	public static void main(String[] args) {
		//만약 numbers의 배열이 늘어나면
		int numbers[] = {1, 2, 3, 4, 5, 6};
		
		//반복문의 조건문을 바꿔줘야한다. 그래서 배열의 크기를 가져와주는 배열.length사용
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		

	}

}
