package j19_익명클래스.람다식;

public class LambdaExam {

	public static void main(String[] args) {
//		new Thread(new Runnable() {
				//람다표현식에서는 객체 자체를 생성할 필요 없어요
//			@Override
//			public void run() {
//			for(int i = 0; i < 10; i++) {
//				System.out.println("hello");
//			}
//				
//			}
//		}).start(); 
			//Thread 생성자가 (Runable)인터페이스를 받아들임
			new Thread(() -> {
				for(int i = 0; i < 10; i++) {
				System.out.println("hello");
				}
			}).start();
	}

}
