package j12_다형성.인터페이스;

import java.util.Scanner;

import j12_다형성.인터페이스.Usb복습해라.Keyboard;
import j12_다형성.인터페이스.Usb복습해라.Mouse;
import j12_다형성.인터페이스.Usb복습해라.USB;

public class Computer {
	
	private ConnectionTerminal connectionTerminal;  		//DI 방식 사용하려고 변수 선언
	private USB usb1;
	private USB usb2;
	Scanner scanner;
	
	
	public Computer(ConnectionTerminal connectionTerminal, USB usb1, USB usb2) {
//		this.hdmi = new Monitor(); 이렇게 하면 모니터 일체형
		this.connectionTerminal = connectionTerminal;  //우리는 ct 통해 새로운 모니터로 갈아끼울 수 있게 하겠다. >>> 어제 수업 DI도 다시 이해하기
		this.usb1 = usb1;
		this.usb2 = usb2;
		
	}
		
	public void powerOn() {
	System.out.println("컴퓨터의 전원을 켭니다.");
		connectDisplay();
		showConnectionTerminalVersion();
		if(usb1 != null) usb1.connect();
		if(usb2 != null) usb2.connect();
		soundOn();
	}
	public void powerOff() {
		if(usb1 != null) usb1.disConnect();
		if(usb2 != null) usb2.disConnect();
		disConnectDisplay();
		System.out.println("컴퓨터의 전원을 끕니다.");
	}
	private void connectDisplay() {
		System.out.println("출력장치를 연결합니다.");
		connectionTerminal.connect();  // -> 업캐스팅된 모니터가 들어오면 모니터.connect
	}
	private void disConnectDisplay() {
		System.out.println("출력 장치 연결을 해제합니다.");
		connectionTerminal.disConnect();  // -> 업캐스팅된 빔프로젝터가 들어오면 빔프로젝트.disconnect
	}
	private void soundOn() {
		if(connectionTerminal instanceof HDMI) {  //connectionTerminal이 HDMI이면
			((HDMI) connectionTerminal).soundOutput();
			System.out.println("소리를 출력합니다.");
		}else {
			System.out.println("연결된 스피커가 없습니다.");
		}
	}
	private void showConnectionTerminalVersion() {
		if(connectionTerminal instanceof HDMI) {
			System.out.println("HDMI Version: " + HDMI.VERSION);
		}else if(connectionTerminal instanceof VGA) {
			System.out.println("VGA Version: " + VGA.VERSION);
		}else {
			System.out.println("Version Information is missing");
		}
	}
	
		
	
}
