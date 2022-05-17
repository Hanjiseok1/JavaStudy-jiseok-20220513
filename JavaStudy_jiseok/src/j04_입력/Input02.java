package j04_입력;

import java.util.Scanner;

public class Input02 {

	public static void main(String[] args) {
		/*
		 * 띄어쓰기가 들어갈땐 nextLine을 써야함
		 * [개인정보 입력]
		 * 이름: 김준일					문자열
		 * 나이: 29						정수
		 * 연락처: 010-9988-1916		문자열
		 * 주소: 부산 동래구 사직동		문자열
		 * 성별: 남						문자
		 * 
		 */
			
		Scanner sc = new Scanner(System.in);
		
		String name = null;
		int age = 0;
		String phone = null;
		String address = null;
		char gender = 0;
		
		System.out.print("이름: ");
		name = sc.next();
		System.out.print("나이: ");
		age = sc.nextInt();
		System.out.print("연락처: ");
		phone = sc.next();
		sc.nextLine(); // 전에 입력받은 것을 상쇄시키기 위해서 코드작성
		System.out.print("주소: ");
		address = sc.nextLine();
		System.out.print("성별: ");
		gender = sc.next().charAt(0);
		
		System.out.println("[사용자 정보 출력]");
		System.out.println("이름: " + name);		//김준일\n
		System.out.println("나이: " + age);			//29\n
		System.out.println("연락처: " + phone);		//010-9988-1916\n
		System.out.println("주소: " + address);		
		System.out.println("성별: " + gender);
	}

}
