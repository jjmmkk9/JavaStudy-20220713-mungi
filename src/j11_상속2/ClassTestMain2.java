package j11_상속2;

public class ClassTestMain2 {
	/*
	 * 여기서 배열에 담을때 업캐스팅 해주는 이유는
	 * 업캐스팅 해서 ClassA자료형으로 만들어줘야 배열에 자식들을 같이 담을 수 있기 때문이다. 
	 * 같이 담아서 배열에 넣을 수 있으면 하나의 반복문으로 돌릴 수 있기 때문이다. 
	 * 
	 * 그런데 업캐스팅 된 상태로는 B나 C에만 있는 메소드들은 여기서 사용하지 못한다.
	 * 당연함 업캐스팅했음;; 왜냐면 A는 부모라서 자식들 메소드는 안가짐;;!!! 
	 * 그럼 쓰고싶으면 다시 다운캐스팅 해서 쓰라는 거임 
	 */
	public static void main(String[] args) {	
		int num = 10;
		
		int[] numbers = new int[2];
		numbers[0] = num;
		System.out.println(numbers[0]);
		
		ClassA b = new ClassB(); //변수에 넣어서 업캐스팅
		ClassA[] arrayA = new ClassA[2]; //ClassA를 담을 수 있는 공간 2개 
		arrayA[0] = b;  // 이 배열 안에는 b라는 주소가 들어있다. 
		
		arrayA[1] = new ClassC();  //변수에 안넣고 바로 생성
		
		arrayA[0].printInfo();  //  = b.printInfo();
		arrayA[1].printInfo(); 
		
		for(int i = 0; i < arrayA.length; i++) {
			arrayA[i].printInfo();
			/* b.printInfo();
			 * ClassC.printInfo();
			 * null.printInfo();
			 */
			
		}	//닉네임				//걍 번호 
		//전사 b2  = (다시돌아가전사로) arrayA[0]유저
		ClassB b2 = (ClassB) arrayA[0];   
			//근데 우리가 B도 C도 A로 묶어서 반복 해뒀으니까 C가 B로 업캐스팅해라는 주문이
			//언젠가 들어오게 됨 그럼 그때 밑에 if문으로 원래 Class가 B였는지 물어서 해줌
		
		if(arrayA[0] instanceof ClassB) {//원래 B였니
		System.out.println("클래스 B였음");
	}else {
		System.out.println("클래스 B가 아님");
	}
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
