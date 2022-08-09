package j19_익명클래스.ForEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class CollectionForEach {

	public static void main(String[] args) {
		
		String name = "김준일, 강민지, 박진관, 오유리, 조문기, 김호영"
				+ ", 박소영, 고준호, 서재효, 송상현, 하덕현";
		int studentCode = 20220001;
		
		List<String> studentList = new ArrayList<String>();
		String[] students = name.split(", ");
		studentList = Arrays.asList(students);
				
		List<Integer> codeList = new ArrayList<Integer>();
		for(int i  = 0; i < students.length; i++) {
			codeList.add(studentCode++);
		}
		
		Map<Integer, String> studentMap = new HashMap<Integer, String >();
		for(int i = 0; i < students.length; i++) {
		studentMap.put(codeList.get(i), studentList.get(i));
		}
//정렬 안한거
//		studentMap.forEach((k, v) -> {
//			System.out.print("학번: " + k);
//			System.out.println(", 이름: " + v);
//		});
		

//정렬한거  -> 이렇게 하거나 아니면 hashMap 말고 TreeMap 쓰면 정렬됨 (k가 integer인경우)
		List<Integer> keySet = new ArrayList<Integer>(studentMap.keySet());
        // 키 값으로 오름차순 정렬
        Collections.sort(keySet);

        for (Integer key : keySet) {
            System.out.print("학번 : " + key);
            System.out.println(", 이름 : " + studentMap.get(key)); //get(key) 하면 value가 나옴
        }
	}
	
	

}
