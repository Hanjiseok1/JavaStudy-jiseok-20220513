package j04_입력;

import java.util.Scanner;

public class Input03 {

	public static void main(String[] args) {
		/*
		 * 문자열1 입력: nextLine()		hi
		 * 문자열2 입력: next()			안녕
		 * 문자 입력: next().charAt()	A
		 * 정수 입력: nextInt()			10
		 * 실수 입력: nextDouble()		3.14
		 */
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("문자열1 입력: ");
//		String result = sc.nextLine();
//		
//		System.out.print("문자열2 입력: ");
//		String result1 = sc.next();
//		
//		System.out.print("문자 입력: ");
//		char result2 = sc.next().charAt(0);
//		
//		System.out.print("정수 입력: ");
//		int resutl3 = sc.nextInt();
//		
//		System.out.print("실수 입력: ");
//		double result4 = sc.nextDouble();
//		
//		System.out.println(result);
//		System.out.println(result1);
//		System.out.println(result2);
//		System.out.println(result3);
//		System.out.println(result4);
		
		Scanner scanner = new Scanner(System.in);
		String a = null;
		String b = null;
		char c = 0;
		int d = 0;
		double e = 0;
		
		System.out.print("문자열1 입력: ");
		a = scanner.nextLine();
		System.out.print("문자열2 입력: ");
		b = scanner.next();
		System.out.print("문자 입력: ");
		c = scanner.next().charAt(0);
		System.out.print("정수 입력: ");
		d = scanner.nextInt();
		System.out.print("실수 입력: ");
		e = scanner.nextDouble();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

}
