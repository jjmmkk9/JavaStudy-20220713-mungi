package j03_연산자;

public class String1 {

	public static void main(String[] args) {
		String address = "부산시 동래구 사직동";
						// 0 1 234 5 6 7 8 9 10
		
		int index = address.indexOf("동");  //4
		int index2 = address.lastIndexOf("동"); //10
		String subAddress = address.substring(index, index2 + 1);
											//4"동"부터 11전인 "동" 까지
		System.out.println(subAddress);
		
		String replaceAddress = address.replace(' ', '-');
		System.out.println(replaceAddress);
		replaceAddress = address.replaceAll(" ", "-");
		System.out.println(replaceAddress);
		
		
		String phoneNumbers = "010/9988/1916, 010/1234/5678";
		
		String rePhone = phoneNumbers.replaceAll("010", "011");
		System.out.println(rePhone);
		rePhone = rePhone.replaceAll("/", "-");
		System.out.println(rePhone);
		rePhone = rePhone.replaceAll(", ","/" );
		System.out.println(rePhone);
		
		
		String rePhone2 = phoneNumbers.replaceAll("010", "011")
				.replaceAll("/", "-")
				.replaceAll(", ", "/");
				System.out.println(rePhone2);
				
	}

}
