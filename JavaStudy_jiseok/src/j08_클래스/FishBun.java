package j08_클래스;
 /*
  * 클래스는 변수와 메소드로 이루어짐.
  * 클래스는 인스턴스를 만들수있다.
  * 클래스 명은 무조건 대문자로 시작해야함
  * 클래스도 자료형이다.(참조자료형)
  * 메소드는 소문자로 시작 클래스는 대문자로 시작
  */
public class FishBun { //변수
	String material; //재료
	String dough;
	
	FishBun(){ //생성자
		System.out.println("생성자 호출"); 
		//클래스명과 같다. 반환자료형이 생략되어있다 또한 메소드와 똑같은 동작을 한다. 주소값을 반환한다.
	}
	
	void showInfo() { //메소드
		System.out.println("재료: " +  material);
		System.out.println("반죽: " + dough);
	}

}
