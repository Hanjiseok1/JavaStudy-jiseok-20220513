package j18_최상위클래스;

//		Object obj = t1; // 업캐스팅 가능(Object로 상속 또는 구현이 되었다.)

// toString은 정보를 담는 클래스들이 가장 많이 사용한다.


public class Main {
	
	public static void main(String[] args) {
		Teacher t1 = new Teacher("김준일", "웹개발");
		Teacher t2 = new Teacher("김준일", "웹개발");
		
		System.out.println(t1); //toString 은 생략이 가능하다
		System.out.println(t2.toString());
		System.out.println(t1 == t2); // == 는 주소값이 같은지 비교할때 사용 된다.
		System.out.println(t1.equals(t2));// false 가 나오는 이유는 상속받는 클래스가 달라서 String클래스랑 다르게 나옴
		System.out.println(t1.hashCode() == t2.hashCode());
	}
	
}
