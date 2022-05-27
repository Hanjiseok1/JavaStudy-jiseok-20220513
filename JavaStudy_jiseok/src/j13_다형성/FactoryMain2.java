package j13_다형성;

public class FactoryMain2 {

	public static void main(String[] args) {
		
		Factory[] factoryes = new Factory[100];
		
//		factoryes[0] = new SmartPhoneFactory();		// 업캐스팅이 가능하기 때문. 업캐스팅을 하게 되면 부모가 가진 메소드 밖에 못씀.
//		factoryes[1] = new ComputerFactory();		
		
		for(int i = 0; i < factoryes.length; i++) {
			// 삼항연산자, 조건연산자
			factoryes[i] = i % 2 == 0 ? new SmartPhoneFactory() : new ComputerFactory();
		}
		
		//foreach문 
		for(Factory factory : factoryes) {
			factory.start();
		}
		
		int i = 10;
		double d = i;
		int ii = (int)d;
		
		System.out.println();
		
		//다운캐스팅
		// instance - 인스턴스란 생성된 객체를 의미함.
		for(Factory factory : factoryes) {
			if(factory instanceof SmartPhoneFactory) {
				SmartPhoneFactory spf = (SmartPhoneFactory) factory;
				spf.showSmartPhone();
			}else if(factory instanceof ComputerFactory){
				ComputerFactory cf = (ComputerFactory)factory;
				cf.showComputer(); 
			}else {
				System.out.println("다운캐스팅 할 수 없습니다.");
			}
			
		}
	}
}
