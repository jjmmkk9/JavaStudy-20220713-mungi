package j13_최상위_클래스;

public class ToString {
	
	private int a;
	private int b;
	
	public ToString(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "ToString [a=" + a + ", b=" + b + "]";
		//변수들이 어떤 값을 가지고 있는지 한번에 다 보고싶다. 
		// 이전에는 메소드를 showInfo를 만들어서 출력
		
		// return getClass().getName() + "@" + Integer.toHexString(hashCode());
		//j13_최상위클래스.ToString@6f2b958e  (hashCode = 메모리 주소)
	}


	}

