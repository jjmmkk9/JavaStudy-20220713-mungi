package j16_제네릭;

import j14_lombok.Car;

public class GenericMain {

	public static void main(String[] args) {
	GenericTest<Integer, String> genericTest = new GenericTest<Integer, String>(); //생성시점에 자료형을 바꿔줄수있다.
	GenericTest<Integer, Car> genericTest2 = new GenericTest<Integer, Car>(); //생성시점에 자료형을 바꿔줄수있다.
	
	genericTest.setKey(100);
	genericTest.setValue("원");
	
	System.out.println(genericTest.getKey() + genericTest.getValue());
	
	}

}
