package j04_입력;

import java.util.Scanner;

public class Input06 {

	public static void main(String[] args) {
		/*
		 * 삼항연산자를 이용해서 부등호 출력하기
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		
		System.out.print("두 수를 입력하세요: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("두 수를 합은: " + (a + b));
		System.out.println(a > b ? ">" : a < b ? "<" : "==");
	}

}
