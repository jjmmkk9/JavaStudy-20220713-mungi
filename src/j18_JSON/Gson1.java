package j18_JSON;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson1 {

	public static void main(String[] args) {
		//Gson 객체 생성하는 방법
		
		//1. Gson() Constructor로 생성
		Gson gson1 = new Gson();
		
		//2. GsonBuilder() 생성자를 통해 생성 -> (create는 build()처럼 마지막에 찍어줌)
		Gson gson2 = new GsonBuilder().create();
		
		//JSON 이쁘게 출력
		Gson gson3 = new GsonBuilder().setPrettyPrinting().create();
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("username", "junil");		//map은 put한 순서에 관계없이 순서 마구잡이
		map.put("password", "1234");
		map.put("name", "김준일");
		map.put("email", "junil@naver.com");
		
		//이쁘게 출력  Json자료형 String임
		String json1 = gson3.toJson(map);  
		//그냥 출력
		String json2 = gson2.toJson(map);
		
		
		System.out.println(json1);
		System.out.println(json2);
	}

}
