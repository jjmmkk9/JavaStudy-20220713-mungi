package j11_상속.factory;

public class FactoryMain5 {

	public static void main(String[] args) {
		/*
		 * Factory Array [20]
		 * 
		 * 배열 짝수에는 삼성팩토리 생성 대입
		 * 배열 홀수에는 엘지팩토리 생성 대입
		 * 삼성공장도 1~10 엘지공장도 1~10
		 */
		
		Factory[] factoryArray = new Factory[100];
		for( int i = 0; i < factoryArray.length; i++) {
			if(i % 2 == 0) {
				factoryArray[i] = new LgFactory((i + 2) / 2);
			}else {
				factoryArray[i] = new SamsungFactory((i + 1) / 2);
			}
			
			
		}
		for(int i = 0; i < factoryArray.length; i++) {
			factoryArray[i].start();
			if(factoryArray[i] instanceof SamsungFactory) {
				((SamsungFactory) factoryArray[i]).produceSmartPhone();
			}else {
				((LgFactory) factoryArray[i]).produceSmartTv();
			}
			factoryArray[i].stop();
			System.out.println();
		}
		
		}
		
		
		
		
	}

