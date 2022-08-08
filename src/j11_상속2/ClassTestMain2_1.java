package j11_상속2;

public class ClassTestMain2_1 {
	
	public static void main(String[] args) {	
		int num = 10;

		int[] numbers = new int[2];
		numbers[0] = num;
		System.out.println(numbers[0]);
		
		 				//변수에 넣어서 업캐스팅
		ClassA[] arrayA = new ClassA[4]; 		//ClassA를 담을 수 있는 공간 10개
		for(int i = 0; i < arrayA.length; i++) {
			
			
			if(i %  2 == 0) {
				ClassA b2 = new ClassB();
				arrayA[i] = b2;
			}else {
				ClassA c2 = new ClassC();
				arrayA[i] = c2;
			}
		}
		
		for(int i = 0; i < arrayA.length; i++) {
			System.out.println(arrayA[i]);

			
		}	//닉네임				//걍 번호 
		//전사 b2  = (다시돌아가전사로) arrayA[0]유저
		ClassB b2 = (ClassB) arrayA[0];   
			//근데 우리가 B도 C도 A로 묶어서 반복 해뒀으니까 C가 B로 업캐스팅해라는 주문이
			//언젠가 들어오게 됨 그럼 그때 밑에 if문으로 원래 Class가 B였는지 물어서 해줌
		
		for(int i = 0; i < arrayA.length; i++) {
		if(arrayA[i] instanceof ClassB) {//원래 B였니
			
		System.out.println("클래스 B였음");
	}else {
		System.out.println("클래스 B가 아님");
	}
		}
		System.out.println();
		
		for(int i = 0; i < arrayA.length; i++) {
			if(arrayA[i] instanceof ClassB) {
				ClassB b3 = (ClassB) arrayA[i];
				b3.addData();
			}else if(arrayA[i] instanceof ClassC) {
				ClassC c3 = (ClassC) arrayA[i];
				c3.removeData();
			}else {
				System.out.println("다운캐스팅 불가");
			}
		}
}
}
