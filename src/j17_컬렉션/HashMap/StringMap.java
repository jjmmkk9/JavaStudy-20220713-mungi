package j17_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;
	
/*
 * map은 중복이 안되고 순서가 없다.(순서가 없으면 인덱스가 없어서 반복을 못돌림)
 * map<k,v> 
 * 
 */
public class StringMap {

	public static void main(String[] args) {
		HashMap<Integer, String> strMap = new HashMap<Integer, String>();
		
		HashMap<String, String> strMap2 = new HashMap<String, String>();

			strMap.put(1,"java1");
			strMap.put(2,"java2");
			strMap.put(3,"java3");
			strMap.put(4,"java4");  //key 값이 중복되면 안된다. 
			System.out.println(strMap);
					// key    value
			strMap2.put("a", "python");
			strMap2.put("b", "python");
			strMap2.put("c", "python");
			strMap2.put("d", "python");
			System.out.println(strMap2);
			
			//map은 무조건 뽀이치 돌릴 수 없다.
			Iterator<Integer> irKey = strMap.keySet().iterator();
			while(irKey.hasNext()) {   //get을 하면 value를 가지고옴
				System.out.println(strMap.get(irKey.next()));
			}
			strMap.entrySet().forEach(arg -> {
				System.out.println(arg);
				System.out.println(arg.getKey());
				System.out.println(arg.getValue());
			});
			
		
	}

}
