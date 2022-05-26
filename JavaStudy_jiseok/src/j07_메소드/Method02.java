package j07_메소드;

/*
 * 클래스 안에 정의된 함수를 메소드라고 한다
 * 자바에서 모든 함수는 메소드이다.
 */

public class Method02 {
	
	// void의 뜻 - 공허하다, 비어있다
	// void를 사용할 경우 반환값이 없음.(return이 없음.)
	
	//매개변수가 없으면서 반환도 없는 메소드
	public static void test1() {
		System.out.println("test1 메소드 실행");
	}

	// 매개변수는 있고 반환이 없는 메소드
	public static void test2(int age, int year) { // 괄호안에 있는 것이 매개변수라 함.
		System.out.println("나이: " + age);
		System.out.println("출생년도: " + year);
	}
	
	//매개변수가 없고 반환(return)이 있는 메소드
	// String 은 클래스로 구분되어 짐. 또한 클래스도 반환이 가능함.
	public static String test3() {
		return "김준일";
	}
	
	public static int test4() { // int 는 일반 자료형
		return 10000;
	}
	
	//매개변수도 있고 반환도 있는 메소드
	public static String test5(String name, int num) {
		return name + num;
	}
	
	//return 자료형이 void일때 메소드를 강제로 탈출하는 방법
	public static void test6() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i == 3) {
				System.out.println("메소드 탈출");
				//break;     // break는 메소드를 멈추는게 아니라 반복을 멈추는것임
				return;      // return은 언제든지 호출가능하지만 리턴뒤로 명령어는 쓰지못함.
			}
			System.out.println("test6가 정상 종료 되었습니다.");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("메인함수 시작");
		test1(); // 호출
		test2(29, 1994);
		String name = test3();
		System.out.println(test5("김준일", 1));
		test6();
		System.out.println("메인함수 끝");
		
	}

}
