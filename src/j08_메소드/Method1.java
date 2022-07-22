package j08_메소드;

public class Method1 {
							//data는 지역변수이면서 printData의 String 자료형의 매개변수(값이 들어오는 통로!)
	public static void printData(String data) {
		while (true) {
			int cmdIndex = data.indexOf("@") + 1;
			int cntIndex = data.indexOf(":");
			int nextCommandIndex = data.indexOf("@", 1);

			String cmd = data.substring(cmdIndex, cntIndex);

			String cnt = nextCommandIndex != -1 ? data.substring(cntIndex + 1, nextCommandIndex)
					: data.substring(cntIndex + 1); // -1이면 nextCommandIndex 포함 XX

			System.out.println(cmd + ": " + cnt);

			if (nextCommandIndex == -1) {
				break;
			}
			data = data.substring(nextCommandIndex);
		}
		System.out.println("-------------------------------------------");
		System.out.println();

	}
	public static void main(String[] args) {
		String data = "@Message:안녕하세요.@To:김준일@From:김준이@SendDate:2022/07/21@test:가나다라";
		String data2 = "@Message:안녕하세요.@To:김준일@From:김준이@SendDate:2022/07/21@test:가나다라";
		String data3 = "@Message:안녕하세요.@To:김준일@From:김준이@SendDate:2022/07/21@test:가나다라";
		
		
		printData(data);
		printData(data2);
		printData(data3);
		
	}

}
