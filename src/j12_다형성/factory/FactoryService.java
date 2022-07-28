package j12_다형성.factory;

import j11_상속.factory.Factory;

public class FactoryService {

	private Factory factory; // factory변수 생성!!! 해줘야 생성자 통해 결합도 낮은 값을 받아올수 있음

	public FactoryService(Factory factory) { // 생성자를 통해 생성할 때 값을 넣어 놓거나~~~~~~~`
		this.factory = factory; // 여기에 new SamdungFactory 해버리면 삼성이랑 결합해버림
								//이렇게 결합도 낮은게 DI방식 의존성주입이라고 한다~~~~
	}

	public void factoryStart() {
		factory.start();
	}

	public void factoryStop() {
		factory.stop();
	}

	public void setFactory(Factory factory) { // 세터를 통해 중간에 값을 바꾸거나~~~~~~~`
		this.factory = factory;
	}

}
