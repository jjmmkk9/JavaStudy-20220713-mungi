package j12_다형성.인터페이스;

public class Monitor implements HDMI, VGA{
  //구현되지 않은 메소드가 있으면 implements시 빨간줄
	
	@Override
	public void connect() {
		System.out.println("케이블을 통해 모니터를 연결합니다. ");
	}
	@Override
	public void disConnect() {
		System.out.println("케이블과 모니터 연결을 해제합니다.");
	}
	@Override
	public void soundOutput() {
		System.out.println("HDMI를 통해 소리 출력");
	}
	
}
