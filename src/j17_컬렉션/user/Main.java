package j17_컬렉션.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*  {}       []       {}
 * map안에 list 안에 map
 * { [ { } { } ] } 
 */
public class Main {

	public static void main(String[] args) {
		//map생성  value를 Object로 잡아줘서 모든 자료형 받기 쌉가능
		Map<String, Object> map = new HashMap<String, Object>();  
		//map에 value 값으로 들어갈 list 생성
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		
		//list 안에 들어갈 각각의 inMap 객체 생성
		Map<String, Object> inMap = new HashMap<String, Object>();
		inMap.put("todoCode", 182);
		inMap.put("todo", "스프링 부트 서버 테스트_182");
		inMap.put("todoComplete", true);
		inMap.put("importance", false);
		inMap.put("totalCount", 157);
		inMap.put("incompleteCount", 78);

		
		Map<String, Object> inMap2 = new HashMap<String, Object>();
		inMap2.put("todoCode", 181);
		inMap2.put("todo", "스프링 부트 서버 테스트_181");
		inMap2.put("todoComplete", true);
		inMap2.put("importance", false);
		inMap2.put("totalCount", 157);
		inMap2.put("incompleteCount", 78);
		
		//inMap list에다가 add
		list.add(inMap);
		list.add(inMap2);
		
		
		map.put("code", 1);
		map.put("message", "1page list success to load");
		map.put("data", list);
		
		System.out.println(map);
		

	}

}
