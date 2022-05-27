package j13_다형성;

public class FactoryMain {

	public static void main(String[] args) {
		//업캐스팅 문자 - 정수 - 실수
		Factory smartPhoneFactory = new SmartPhoneFactory();
		Factory computerFactory = new ComputerFactory();
		Factory[] factoryes = new Factory[5]; 
		smartPhoneFactory.start();
		computerFactory.start();
	}

}
