package j12_다형성.복습;

public abstract class Human extends Creature implements Talkable{

	public Human(int x, int y, int age) {
		super(x, y, age);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void attack() {
		System.out.println("도구를 사용!!");
	}
	@Override
	public void talk() {
		System.out.println("사람은 말을 할 수 있다.");
		
	}

}
