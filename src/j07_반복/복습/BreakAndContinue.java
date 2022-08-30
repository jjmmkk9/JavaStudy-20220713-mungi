package j07_반복.복습;

public class BreakAndContinue {
	
	public static void test(String[] strArray) {
		
	}

	public static void main(String[] args) {
		
	
		String[] strArray = new String[] {"a", "b", null, null, "e", "f", null, "h"};
		
		
		for(int i  = 0; i < strArray.length; i++) {
			char a = strArray[0].charAt(0);
			if(strArray[i] == null) {
				strArray[i] = Character.toString((char) ('a' + i));  //a가 97임
			}
			System.out.println("i: " + (i + 1) + " -> " + strArray[i]);
		}
		for(String s : strArray) {
			System.out.println(s);
		}

	}

}
