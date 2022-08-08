package j12_다형성.인터페이스;

public interface HDMI extends ConnectionTerminal{
	public String VERSION = "2.0";  //인터페이스는 기본적으로 스태틱 상수를 사용한다.
									//상수니까 대문자로 적어줍니다.
//	public void connect();
//	public void disConnect();
	
	public void soundOutput();  //HDMI로 연결하면 사운드 나온다 VGA는 안나온다.
	
}
