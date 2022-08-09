package j19_익명클래스.람다식;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class DefaultFunction {

	public static void main(String[] args) {
		
		//void run()
		Runnable runnable = () -> {
			System.out.println("runnable");
		};  //매개변수 x 리턴 x
		runnable.run();
		
		
		//Supplier<T> get()
		Supplier<Integer> supplier = () -> {
			System.out.println("supplier");
			return 100;
		};//매개변수 x 리턴 o
		System.out.println(supplier.get());  //리턴이기 때문에 출력해줘야겟져
		
		
		//Consumer<T> accept()
		Consumer<String> consumer = (name) -> {
			System.out.println("name: " + name);
		};//매개변수 o 리턴 x
		consumer.accept("조문기");
		
		
		//Function<T, R> apply()
		Function<Integer, Integer> function = (num) -> {
			System.out.print("num * num = ");
			return num * num;
		};
		System.out.println(function.apply(8));
		
		
		//Predicate<T> test()  return : boolean 
		Predicate<String> predicate = (str) -> str == null || str.isBlank();
		System.out.println(predicate.test(""));
		
		
		//파라미터가 두개인 함수형 인터페이스>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.
		
		//BiConsumer<T, U> accept
		BiConsumer<Integer, Integer> biConsumer = (num1, num2) ->{
			System.out.println("num1 + num2 = " + (num1 + num2));
		};
		biConsumer.accept(8, 1);
		
		//BiFunction
		//BiPredicate
		
		//파라미터와 리턴타입이 일치 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		//UnaryOperator 
		UnaryOperator<Integer> operator = num -> num * num * num;
		//매개변수 1 반환 o
		System.out.println(operator.apply(2));
		
		
		//
		BinaryOperator<Integer> binaryOperator = (num1, num2) -> num1 * num2;
		//매개변수 2 반환 o
		System.out.println(binaryOperator.apply(2, 9));

	}

}
