package j15_인터페이스;
/* 
 * 인터페이스(interface) : 클래스와 클래스를 연결할때 인터페이스(규격, 통신망)가 같아야 연결이 가능함
   인터페이스는 자바 프로그래밍 언어에서 클래스들이 구현해야 하는 동작을 지정하는데 사용되는 추상 자료형(메소드)이다.
   이들은 프로토콜과 비슷하다. 인터페이스는 interface라는 키워드를 사용하여 선언하며, 메소드 시그너처와 상수 선언만을 포함할 수 있다.
   
 * 약속
 * 1. 기본적으로 모든 메소드는 추상 메소드 이다.
 * 2. 일반 메소드를 사용하고 싶다면 return type 앞에 default 키워드를 사용하여야 한다.
 */

public interface Hdmi {
	public void connect();
	public void disconnect();
		
}
