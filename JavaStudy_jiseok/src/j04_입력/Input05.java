package j04_입력;

import java.util.Scanner;

public class Input05 {

	public static void main(String[] args) {
		// 이스케이프 문자 알아보기
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		
		System.out.print("두 수를 입력하세요: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("두 수를 합은: " + (a + b));
		
	}

}
