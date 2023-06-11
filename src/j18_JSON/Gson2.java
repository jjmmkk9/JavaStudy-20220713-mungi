package j18_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/*
 * User, UserService 이용해서 포함할 값, null값 표기 등등
 */
public class Gson2 {

	public static void main(String[] args) {
								//스태틱 메소드 createUser   return : user 객체 
		User user = UserService.createUser();
		
		//객체를 JSON으로 변환 -> toJson(객체)
		//"사용하려면 GSON있어야 겟죠??"
		Gson gson = new GsonBuilder()
				.excludeFieldsWithoutExposeAnnotation()
				.serializeNulls()  //.serializeNulls() 빼면 null 값 들어간 username 자체가 표기 안됨.
				.setPrettyPrinting()
				.create();
									
		String userJson = gson.toJson(user);
		System.out.println(userJson);
		
		//Object -> Json 변환 toJson(변환할 객체)
		//Json -> Object 변환 fromJson(json문자열, 변환할 객체 클래스);
		//"userJson 텍스트를 User 클래스 객체로 변환한다."
		User userObj = gson.fromJson(userJson, User.class);
		
		//"객체로 변환했으니까 게터 세터 다 쓸 수 있겠됴"
		System.out.println(userObj);
		System.out.println(userObj.getAddress());
	}

}
