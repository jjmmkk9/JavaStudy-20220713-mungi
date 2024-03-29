package j12_다형성.복습;

public class Pigeon extends Animal implements Flyable{

	public Pigeon(int x, int y, int age) {
		super(x, y, age);
	}
	@Override
	public void fly(int yDistance) {
		setY(getY() + yDistance);
		
	}
	@Override
	public void flyMove(int xDistance, int yDistance) {
		setY(getY() + yDistance);
		setX(getX() + xDistance);
		
	}
	@Override
	public void printInfo() {
		System.out.println("Pigeon -> " + toString());
		
	}

}
