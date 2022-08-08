package j19_익명클래스.람다식;

public class CompareExam {
	public static void exec(Compare compare) {
		int k = 10;
		int m = 20;
		
		int value = compare.comtareTo(k, m);
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		exec((value, value2) -> {
			return value - value2;
		});

	}

}
