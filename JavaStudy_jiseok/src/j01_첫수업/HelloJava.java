package j01_첫수업;

public class HelloJava {

	public static void main(String[] args) { // main은 함수 메소드
		System.out.println("Hello, Java");
		System.out.println("Hello, Java");
		System.out.println(10 + 5);
		System.out.println("10 + 5"); // ""를 붙히면 문자로 인식 함
		
		int age = 29;
		
		System.out.print("이름: ");
		System.out.println("김준일");
		System.out.print("직업: ");
		System.out.println("강사");
		System.out.print("나이: ");
		System.out.println(age);
		
		age = 30;
		
		System.out.print("이름: ");
		System.out.println("김준일");
		System.out.print("직업: ");
		System.out.println("강사");
		System.out.print("나이: ");
		System.out.println(age);
		
		age = age + 1;

		System.out.println(age);
		
		// 변수란? 말 그대로 변하는 수
		// 변수 = 자료형 + 변수명
		
		// 자료형 + 변수명 : 선언과 초기화
		//  int     level;
		// level = 10;
		// int level = 10;
		
		// 메모리
		// 변수와 메모리의 관계 : 변수는 컴퓨터 내부의 메모리 공간에 저장된다.
		
		// 카멜표기법? 단어의 시작 문자를 대문자로 쓰기 때문에 중간에
		// 낙타의 혹 처럼 보인다고 해서 카멜 표기법이라함  EX) myName
		
		// 헝가리안 표기법 or 스네이크 표기법? 고안자인 찰스 시모니가
		// 헝가리인이여서 헝가리안 표기법이라 불림 변수의 자료형을 접두어에 붙이는 표기법
		
		System.out.println("\uAC01"); // 유니코드 표 참조
		
	}
}
