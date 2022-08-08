package j12_다형성.복습;

public class Main {

	public static void main(String[] args) {
		Pigeon pigeon = new Pigeon(5, 10, 14);
		pigeon.printInfo();
		pigeon.age();
		pigeon.move(100);
		pigeon.printInfo();
		pigeon.fly(5);
		pigeon.printInfo();
		pigeon.flyMove(10, 20);
		pigeon.printInfo();
		pigeon.attack();
		System.out.println();
		
		Kevin kevin = new Kevin(0, 0, 35);
		kevin.printInfo();
		kevin.age();
		kevin.move(10);
		kevin.printInfo();
		kevin.attack();
		kevin.coding();
		kevin.swimDown(20);
		kevin.printInfo();
		kevin.talk();
		System.out.println();
		
		Turtle turtle = new Turtle(100, -10, 95);
		turtle.printInfo();
		turtle.age();
		turtle.move(-100);
		turtle.printInfo();
		turtle.attack();
		turtle.swimDown(1000);
		turtle.printInfo();
	}

}
