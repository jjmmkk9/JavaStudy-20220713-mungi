package j12_다형성.복습;

public abstract class Creature {
	private int x;  //위치
	private int y;
	private int age;  //나이
	
	//생성자
	public Creature(int x, int y, int age) {
		super();
		this.x = x;
		this.y = y;
		this.age = age;
	}
	//일반 메소드
	public void age() {
		age++;
	}
	public void move(int xDistance) {
		x += xDistance;
	}
	//생명체라면 나이를 먹고 x좌표상으로 이동 할 수 있는 부분이 
	//공통 적인 기능이기 때문에 하위 클래스에서 상속할 수 있도록 
	//일반 메소드로 구현했습니다.

	//게터세터
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	//추상 메소드
	public abstract void attack();
	public abstract void printInfo();
	//추상메서드로는 공격하는 기능과 정보를 출력하는 기능을 선언했습니다. 
	//모든 생명체에 필요한 기능이지만 각각 생명체에 따라 다른 기능으로 
	//구현을 해야하기 때문에 위 두 메서드는 추상메서드로 선언하여 
	//하위클래스에서 처리하도록 한 것입니다.
	
	@Override
	public String toString() {
		return "Creature [x=" + x + ", y=" + y + ", age=" + age + "]";
	}
	
	
	
	
	
}
