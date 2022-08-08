package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 * list는 중복이 되고 순서도 있다. 
 * ArrayList, Vector, LinkedList
 * 
 */

public class StringList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		//값 추가
		list.add("java");
		list.add("python");
		list.add("c");
		list.add("인덱스 선택할 필요도 없이");
		list.add("끝에 들어감");
		list.add("공간의 크기 알아서 늘어남");
		
		//원하는 인덱스에 값 추가
		list.add(1, "css");
		//리스트의 크기
		System.out.println("list 크기: " + list.size() );
		
		//리스트 toString
		System.out.println(list);  //그냥 주소 담은 변수 넣었는데 toString 실행  => 모든 컬렉션들은 toString 지원함
		
		//리스트에서 해당 인덱스로 값 찾기 
		 String subject = list.get(0);
		 System.out.println("0번 인덱스 값: " + subject);
		 
		 //리스트에서 인덱스 찾는 방법
		 int pythonIndex = list.indexOf("python");
		 System.out.println("\"python\"이 있는 인덱스: " + pythonIndex);
		 
		 //해당 인덱스 위치의 값을 수정
		 list.set(3, "c++");
		 System.out.println(list);
		 
		 //해당 리스트가 값을 포함하고 있는지 확인  -> 이해안돼
		 ArrayList<String> tempList = new ArrayList<String>();
		 tempList.add("python");
		 tempList.add("c++");
		 tempList.add("spring");
		 System.out.println(tempList);
		 
		 boolean contains = list.contains("java");
		 boolean containsAll = list.contains(tempList);
		 System.out.println("contains: " + contains);
		 System.out.println("containsAll: " + containsAll);
		 
		 //다른 컬렉션의 데이터를 모두 추가
		 list.addAll(tempList);
		 System.out.println(list);
		 
		 //데이터 삭제
		 //list.remove("python");
		 //System.out.println(list);
		 //list.remove(7);
		 //System.out.println(list);
		 //list.removeAll(tempList);
		 System.out.println(list);
		 
		 //해당 컬렉션을 포함하는 것을 제외하고 다 지움
		 list.retainAll(tempList);
		 System.out.println(list);
		 
		 //해당리스트가 비었는지 확인
		 System.out.println(list.isEmpty());
		 
		 //리스트 전체 비우기
		 list.clear();
		 System.out.println(list);
		 System.out.println(list.isEmpty());
		 
		 //배열을 리스트로 바꿔주는 Arrays.asList
		 List<String> asList = Arrays.asList(new String[] {"java", "python", "c++", "html"});
		 System.out.println(asList);
		 list.addAll(asList);
		 System.out.println(list);
		 
		 System.out.println();
		 
		 for(int i = 0; i < list.size(); i++) {
			 System.out.println(list.get(i));
		 }
		 System.out.println("<<<<<<for each>>>>>>");
		 //for each 뽀이치
		 for(String str : list) {  //list첫번째 값 꺼내서 대입하고 출력하고 대입하고 출력하고 
			 System.out.println(str);
		 }
	}

}
