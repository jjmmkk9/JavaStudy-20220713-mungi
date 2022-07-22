package j04_문자열;

public class StringBuilder1 {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("이름: ");
		stringBuilder.append("김준일");
		stringBuilder.delete(1 , 2); //1번과 2번전까지 지워라 "름" 삭제
		
		System.out.println(stringBuilder.toString());
		
		
	}

}
