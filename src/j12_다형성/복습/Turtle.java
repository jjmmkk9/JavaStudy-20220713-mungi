package j12_다형성.복습;

public class Turtle extends Animal implements Swimable{

	public Turtle(int x, int y, int age) {
		super(x, y, age);
	}
	@Override
	public void swimDown(int yDistance) {
		setY(getY() - yDistance);
	}
	@Override
	public void printInfo() {
		System.out.println("Turtle -> " + toString());
	}
}
