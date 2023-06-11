package j18_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject; //마찬가지 Gson에 있음

/*
 * 객체 없이 바로 JSON만들기 실습
 */
public class Gson4 {

	public static void main(String[] args) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		//객체 없이 바로 json 만들때  -> JsonObject.addproperty
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("name", "조문기");
		jsonObject.addProperty("age", "24");
		jsonObject.addProperty("address", "gimhae");
		jsonObject.addProperty("phone", "010-4717-8209");
		
		String json = gson.toJson(jsonObject);
		System.out.println(json);
		System.out.println();
		System.out.println(jsonObject);
		
		//반대로 json -> jsonObject
		JsonObject jsonObj = gson.fromJson(json, JsonObject.class);
		System.out.println(jsonObj); //setPrettyPrinting안됨 왜냐 객체임
	}

}
