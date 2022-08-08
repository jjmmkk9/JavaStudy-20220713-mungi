package j17_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;
/*
 * set은 값의 중복이 안되고 순서도 없다
 * HashSet, LinkedHashset, TreeSet
 */
public class StringHashSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("java");
		set.add("java");
		set.add("java");
		set.add("python");
		set.add("python");
		set.add("1");
		set.add("2");
		
		System.out.println(set);
		//set.get()을 못한다. 인덱스가 없기 때문에!!
		//값 조회
		Iterator<String> ir = set.iterator();
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
//		System.out.println(ir.hasNext());  // false -> 다음이 없다.
		while(ir.hasNext()) {  		//while안에서는 ir.next()가 딱 한번만 일어나야한다.
			String str = ir.next();	//안그러면 그 다음거 가지고 온다. 그래서 str에 담아서 저장한다.
			if(str.equals("java"));
			System.out.println(str);
		}
		
		//값 수정은 그걸 지우고 그냥 새로 다시 넣는거
	}

}
