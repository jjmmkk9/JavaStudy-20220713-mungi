package j12_다형성.추상.Computer;

public class ComputerMain {

	public static void main(String[] args) {
		Computer c1 = new Laptop(); //Computer는 생성 안돼서 Laptop으로 생성하실게요
		Computer c2 = new DesktopImpl();
		c1.onDisplay();
		c1.onKeyPress();
		c1.onSound();
		
		c2.onDisplay();
		c2.onKeyPress();
		( (Desktop) c2 ).onMouseClick(); //onMouseClick은 Desktop에만 있다. 업캐스팅 해줘야~
		
	}

}
