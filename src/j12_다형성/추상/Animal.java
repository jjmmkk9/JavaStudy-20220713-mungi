package j12_다형성.추상;
/*
 * 추상
 * 추상 메소드가 하나라도 포함되어 있는 클래스는 
 * 무조건 추상 클래스로 정의해야한다.
 * 틀(클래스)를 만들기 위한 설계도(추상클래스)
 * 
 * 특징: Main가서 생성할 때 추상 클래스는 생성할 수 없다. 
 */

public abstract class Animal {
	
	//Abstract Method 추상메소드
	//move라는 공통 특성을 모아서 작성해두겠다
	public abstract void move();
	
	
}
