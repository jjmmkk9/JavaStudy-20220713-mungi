package j19_익명클래스.ForEach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionForEach2 {

	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>();
		
		for(int i = 0; i < 26; i++) {
			strList.add(Character.toString((char) (97 + i)));
//			System.out.println(strList.get(i));
		}											//97 이 소문자 a
		strList.forEach(str -> {
			System.out.println(str);
		});
		
		System.out.println("Set======================================================");
		
		
		Set<String> strSet = new HashSet<String>();
		
		for(int i = 0; i < 26; i++) {
			strSet.add(Character.toString((char) (97 + i)));
		}
		for(String str : strSet) {
			System.out.println(str);
		}

		
		System.out.println("Map======================================================");
		//Map은 뽀이치 못씀 그래서 BiConsumer 
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i = 0; i < 26; i++) {
			map.put(Character.toString((char) (97 + i)), 97 + i);
		}
		map.forEach((k, v) -> {
			System.out.print("key: " + k);
			System.out.print(", ");
			System.out.println("value: " + v);
		});
		
		
	}

}
