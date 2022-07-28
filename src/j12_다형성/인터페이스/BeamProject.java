package j12_다형성.인터페이스;

public class BeamProject implements VGA{

	@Override
	public void connect() {
		System.out.println("VGA를 통해 빔프로젝터를 연결합니다.");
	}

	@Override
	public void disConnect() {
		System.out.println("VGA와 빔프로젝터 연결을 해제합니다.");
	}

}
