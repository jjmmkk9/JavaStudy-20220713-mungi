package j07_반복;

public class Continue {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				continue;
			//짝수일때 continue 해라 --> 내 밑에 있는 거 실행하지 말고 다음 반복으로 넘어갈라
			}
			System.out.println("i: " + i);
		}

	}

}
