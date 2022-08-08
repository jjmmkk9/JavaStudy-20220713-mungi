package j11_상속2;

public class ClassTestMain {
	public static void main(String[] args) {	
		
		System.out.println("((ClassA) new ClassB()).showData();");		
		((ClassA) new ClassB()).showData();
		
//		ClassB bb = new ClassB();  ClassB bb 생성 
//		ClassA aa = bb;   		   ClassA aa 에 방금 생성한 bb 대입
//								    묵시적 업캐스팅이 가능하다 -> ClassA aa = bb; 
//									그런데 이렇게 두줄 쓰는거랑
		ClassA b = new ClassB(); 
		//이렇게 한줄 쓰는게 똑같다. 
		
//		((ClassA) bb).showData();  
//		((ClassA) bb).printInfo(); 얘네랑
		
		b.showData();//
		b.printInfo();//얘네가 똑같음 훨씬 깔끔
		
		ClassC c = new ClassC();
		c.printInfo();  //이거랑 주소:100
		c.showData();
		
//		new ClassC().printInfo(); //이거랑 똑같다 주소:200
		
		/*
		 * 그럼 왜 굳이 변수에 집어넣어서 printInfo 해주냐???
		 * 만약 다시 200번에서 printInfo하고싶으면 주소를 저장 안해둬서 못하기 때문에
		 */
		
	}
}
