package j19_익명클래스.람다식;

@FunctionalInterface  
//람다용이라고 표시 : 메소드를 두개 선언 못함
public interface Math<T1, T2> {
				//Math에 type이 두개 있는데 
	
	public double calc(T1 value1, T2 value2);
				//calc 메소드에는 t1 타입의 value1, t2타입의 value2 를 주겠다  -> 구현 필요
//	public double calc2(T1 value1, T2 value2);   메소드가 두개면 람다에서 -> 화살표가 어떤 메소드를 정의할지 모름

}
