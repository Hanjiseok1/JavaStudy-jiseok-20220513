package j14_추상;
//아주 중요한 Part임
//업캐스팅 문자 - 정수 - 실수
//업캐스팅을 쓰는 이유는 배열을 만들어서 쓸수있기때문임.
public class FactoryMain {

	public static void main(String[] args) {
		Factory samsung = new SamsungFactory();
		Factory lg = new LGFactory();
		
		//Factory클래스를 상속받은 모든 클래스(인스턴스)를 담을수 있는 공간2개의 배열 생성.
		Factory[] factorys = new Factory[2];
		
		factorys[0] = new SamsungFactory(); //업캐스팅 : 하위클래스에서 상위클래스로 바꾸는것
		factorys[1] = new LGFactory();//업캐스팅 
		
		for(Factory factory : factorys) {//foreach : 처음부터 끝가지 반복
			factory.start();
		}
		
		for(Factory factory : factorys) {
			factory.stop();
		}
		
	}

}
