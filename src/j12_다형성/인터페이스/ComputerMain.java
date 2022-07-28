package j12_다형성.인터페이스;

import java.util.Scanner;

import j12_다형성.인터페이스.Usb복습해라.Keyboard;
import j12_다형성.인터페이스.Usb복습해라.Mouse;

public class ComputerMain {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String select = null;
		ConnectionTerminal connectionTerminal = null;
		
		System.out.println("[컴퓨터 연결 관리]");
		System.out.println("1. 모니터 연결");
		System.out.println("2. 빔프로젝터 연결");
		System.out.println("선택 >> ");
		
		select = scanner.nextLine();
		
		if(select.equals("1")) {
			connectionTerminal = new Monitor();  //Monitor가 업캐스팅 되어져서!!!!
		}else if(select.equals("2")) {
			connectionTerminal = new BeamProject();  //BeamProject가 업캐스팅 되어져서!!!!
		}else {
			System.out.println("메뉴를 잘 못 선택하셨습니다.");
		}
		
		Computer computer = new Computer(connectionTerminal, new Mouse(), new Keyboard());  //여기로 들어간다!!!!!!!!!!!!!
		/* 
		 * 
		 */
		
		computer.powerOn();
		
		for(int i = 0; i < 10; i++) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		computer.powerOff();
}
}