package j12_다형성.복습;

public abstract class Animal extends Creature{

	public Animal(int x, int y, int age) {
		super(x, y, age); //상속 받았기 때문에
	}
	@Override
	public void attack() {
		System.out.println("몸을 사용하여 공격!");
		
	}

}
