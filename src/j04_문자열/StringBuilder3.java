package j04_문자열;

public class StringBuilder3 {

	public static void main(String[] args) {
		String names = "김준일님, 서재효님, 임나영님, 문창배님, 전나경님";
		int index = 0;
		//인덱스를 찾아 이름만 잘라서 스트링빌더에 넣는다. 
		// 출력형식 => 김준일/서재효/임나영/문창배/전나경
		StringBuilder stringBuilder = new StringBuilder();
		index = names.indexOf("님", index + 1); //(3, 0+1 => 1index 부터 찾아라)
		stringBuilder.append(names.substring(index - 3 ,index)); //name.substring(0,3);
		stringBuilder.append("/");
		
		index = names.indexOf("님", index + 1); //(9, 3+1 => 4index 부터 찾아라)
		stringBuilder.append(names.substring(index - 3 , index)); //names.substring(6,9);
		stringBuilder.append("/");
		
		index = names.indexOf("님", index + 1); 
		stringBuilder.append(names.substring(index - 3 , index)); 
		stringBuilder.append("/");
		
		index = names.indexOf("님", index + 1); 
		stringBuilder.append(names.substring(index - 3 , index)); 
		stringBuilder.append("/");
		
		index = names.indexOf("님", index + 1); 
		stringBuilder.append(names.substring(index - 3 , index)); 
		
		
		System.out.println(stringBuilder.toString());
		
		StringBuilder stringBuilder2 = new StringBuilder();
		stringBuilder2.append(names);
		index = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index , index + 3);
		index = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index , index + 3);
		index = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index , index + 3);
		index = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index , index + 3);
		index = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index , index + 3);
		
		
		System.out.println(stringBuilder2.toString());
		
	
	
	}

}
