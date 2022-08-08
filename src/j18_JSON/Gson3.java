package j18_JSON;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
/*
 * map 으로 생성해서 형변환
 */
public class Gson3 {

	public static void main(String[] args) {
		User user = new UserService().createUser();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		Map<String, Object> map = new HashMap<String, Object>();
		
		//Map -> Json
		map.put("code", 1);
		map.put("message", "Json 형변환 테스트");
		map.put("data", user);
		
		String mapJson = gson.toJson(map);
		System.out.println(mapJson);
		
		
		//Json -> Map  형변환 하면 숫자는 실수로 나옴 (왜...)
		Map<String, Object> mapObj = gson.fromJson(mapJson, Map.class);
		System.out.println(mapObj);
		mapObj.replace("code",((Double) mapObj.get("code")).intValue());
							//map 밸류값이 Object로 업캐스팅 되어있어서 이걸 꺼낼때 
							//Double(클래스형태)로 다운해서 여기서 .intValue 메소드로 바꿔줘야함

	}

}
