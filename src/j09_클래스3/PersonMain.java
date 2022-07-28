package j09_클래스3;

public class PersonMain {
	public static void main(String[] args) {
	
		String[] names = {"김준일", "서재효", "전나경"};
		int[] ages = {29, 25, 23};
		for(int i = 0; i < names.length; i++) {
			System.out.println(i + 1 + "번 사람(이름): " + names[i]);
			System.out.println(i + 1 + "번 사람(나이): " + ages[i]);
		}
		Person person1 = new Person();//클래스 생성자 호출하면 사람이 한명 만들어진다. 
	}
}
