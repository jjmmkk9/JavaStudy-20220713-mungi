package j17_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import j17_컬렉션.ArrayList.복습.User;

public class Dictionary {

	public static void main(String[] args) {

		Map<String, String> dict = new HashMap<String, String>();
				//key값을 잡아주는게 중요하다. (username이나 usercode 등 고유한것)
		dict.put("축구", "축구 -> soccer");
		dict.put("야구", "야구 -> baseball");
		dict.put("농구", "농구 -> basketball");
		dict.put("골프", "골프 ->  golf");
		
		
		Map<String, User> userDict = new HashMap<String, User>();
		String username = "junil";
		userDict.put(username,User.builder().username(username).password("1234").build());
		
		if(userDict.containsKey("aaa")) {
			System.out.println(userDict.get("aaa"));
		}
		Scanner scanner = new Scanner(System.in);
		String searchText = null;
		
		while(true) {
		System.out.println("[ 사전 검색 기능 ]");
		System.out.println("# 프로그램 종료 명령 (exit) #");
		System.out.print("검색어: ");
		searchText = scanner.nextLine();
		if(searchText.equals("exit")) {
			System.out.println("프로그램 종료");
			break;
		}else if(dict.containsKey(searchText)) {
			System.out.println(dict.get(searchText));
//		}else if(searchText.equals("야구")) {    	map 없었으면 이딴식으로 써야됨
//			System.out.println("야구 -> baseball");
//		}else if(searchText.equals("농구")) {
//			System.out.println("농구 -> basketball");
//		}else if(searchText.equals("골프")) {
//			System.out.println("골프 ->  golf");
		}else {
			System.out.println("검색결과 없음");
		}
		System.out.println();
		}
		/*
		 * 한글 입력하면 
		 * 영어단어 나오게
		 * 축구 -> soccer
		 * 야구 -> baseball
		 * 농구 -> basketball
		 * 골프 -> golf
		 * 
		 */

	}

}
