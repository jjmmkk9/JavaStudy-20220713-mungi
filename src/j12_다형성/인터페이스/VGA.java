package j12_다형성.인터페이스;

public interface VGA extends ConnectionTerminal{
	
	
	public String VERSION = "DDC-2"; // 인터페이스는 기본적으로 스태틱 상수를 사용한다.
									// 상수니까 대문자로 적어줍니다.

//	public void connect();
//
//	public void disConnect();   ct에 상속시키고 메소드는 지운다.
}
