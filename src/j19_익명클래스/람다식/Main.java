package j19_익명클래스.람다식;

public class Main {

	public static void main(String[] args) {
		
	//int
		Math<Integer, Integer> plusMathInteger = new Math<Integer, Integer>(){
			
			@Override
			public double calc(Integer value1, Integer value2) {
				return value1 + value2;
			}
			
		};
		System.out.println(plusMathInteger.calc(10, 20));
		
		
	//double
		Math<Double, Double> plusMathDouble = new Math<Double, Double>(){
			
			@Override
			public double calc(Double value1, Double value2) {
				return value1 + value2;
			}
			
		};
		System.out.println(plusMathDouble.calc(100.5, 200.5));
		
		
	//람다식
		Math<Double,Double> plusMathLamda                = (v1, v2)           ->            v1 + v2;  //원래 익명클래스 자리 
		//Math는 인터페이스   이 인터페이스를 찾아서   매개변수를 정의    calc메소드      리턴, 실행부
		System.out.println(plusMathLamda.calc(50.5, 10.5));
		
	//람다식2
		Math<Double,Double> plusMathLamda2 = (v1, v2) -> {
			System.out.println("v1: " + v1);
			System.out.println("v2: " + v2);
			return v1 + v2;
		};
		
	}

}
