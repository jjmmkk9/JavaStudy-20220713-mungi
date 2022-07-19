package j05_입력;

public class AplusB {

	public static void main(String[] args) {
		int result = 0;
		for (int i = 0; i < 100; i++) {
			if (i % 2 != 0) {
				continue;
			}
			result = result + i;
		}
		System.out.println(result);

	}

}
