package j07_반복;

public class ProtocolSubString {

	/*
	 * @ 뒤에 오는 문자열이 명령어 : 뒤에 오는 문자열은 내용
	 */
	public static void main(String[] args) {
		String data = "@Message:안녕하세요.@To:김준일@From:김준이@SendDate:2022/07/21@test:가나다라";
						//코드는 데이터가 수정되어도 돌아가게
		while(true) {
			int cmdIndex = data.indexOf("@") + 1;
			int cntIndex = data.indexOf(":");
			int nextCommandIndex = data.indexOf("@", 1);
			
			//						data.indexOf("@") + 1, data.indexOf(":")
			String cmd = data.substring(cmdIndex, cntIndex);
			
			//					마지막에 -1되면 조건 하나 변경하는거 삼항연산자로!!!1
			String cnt = nextCommandIndex != -1 ? data.substring(cntIndex + 1, nextCommandIndex)
					: data.substring(cntIndex + 1) ;  //-1이면 nextCommandIndex 포함 XX

				// if 조건 잡는 부분이 내가 안됐던 부분
				// cmd.equals"@@"  ==> 대입 대입 대입 대입
				System.out.println(cmd + ": " + cnt);
				
					if(nextCommandIndex == -1) {
						break;
		}
					data = data.substring(nextCommandIndex);
		}
//			내가 한 거..
//		while(true) {
//			int index = data.indexOf("@", 0);
//			int index2 = data.indexOf("@", index + 1);
//			message = data.substring(index, index2);
//			data = data.substring(index2, data.length());
//			
//			index = data.indexOf("@", 0);
//			index2 = data.indexOf("@", index + 1);
//			to = data.substring(index, index2);
//			data = data.substring(index2, data.length());
//			
//			index = data.indexOf("@", 0);
//			index2 = data.indexOf("@", index + 1);
//			from = data.substring(index, index2);
//			data = data.substring(index2, data.length());
//			
//			index = data.indexOf("@", 0);
//			index2 = data.indexOf("@", index);
//			sendDate = data.substring(index);
//			data = data.substring(index2, data.length());
//			
//			System.out.println("data: " + data);


	}

}
