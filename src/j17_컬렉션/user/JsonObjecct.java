package j17_컬렉션.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonObjecct {

	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		Map<String, Object> inMap1 = new HashMap<String, Object>();  
		inMap1.put("name", "bulbasaur");
		inMap1.put("url", "https://pokeapi.co/api/v2/pokemon/1/");
		
		Map<String, Object> inMap2 = new HashMap<String, Object>();
		inMap2.put("name", "ivysaur");
		inMap2.put("url", "https://pokeapi.co/api/v2/pokemon/2/");
		
		Map<String, Object> inMap3 = new HashMap<String, Object>();
		inMap3.put("name", "venusaur");
		inMap3.put("url", "https://pokeapi.co/api/v2/pokemon/3/");
		
		
		
		list.add(inMap1);
		list.add(inMap2);
		list.add(inMap3);
		
		map.put("count", 1118);
		map.put("next", "https://pokeapi.co/api/v2/pokemon/?offset=3&limit=3");
		map.put("previoud", null);
		map.put("result", list);
		
		System.out.println(map);

	}

}
