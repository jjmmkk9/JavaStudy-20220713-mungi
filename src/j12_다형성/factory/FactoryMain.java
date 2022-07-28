package j12_다형성.factory;

import java.util.Scanner;

import j11_상속.factory.Factory;
import j11_상속.factory.LgFactory;
import j11_상속.factory.SamsungFactory;

public class FactoryMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Factory factory = null;
		String select = null;
		
		System.out.println("1. 삼성공장");
		System.out.println("2. LG공장");
		System.out.print("공장을 선택하세요: ");
		select = scanner.nextLine();
		
		if(select.equals("1")) {
			factory = new SamsungFactory(1);
		}else {
			factory = new LgFactory(1);
		}
//		
//		SamsungFactory samsungFactory = new SamsungFactory(1);
//		LgFactory lgFactory = new LgFactory(1);
//		
		FactoryService factoryService = new FactoryService(factory);
		factoryService.factoryStart();
		factoryService.factoryStop();
		//이렇게 하면 삼성1공장을 가동합니다. 
		//삼성1공장을 중지합니다. 뜸

	}

}
