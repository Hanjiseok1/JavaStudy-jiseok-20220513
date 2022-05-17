package j04_입력;

import java.util.Scanner;
// import
public class Homework {

	public static void main(String[] args) {
		/*
		 * 4의 배수 이면서(&&) 100의 배수가 아니거나(||) 400의 배수인 것
		 * 참이면 윤년
		 * 거짓이면 윤년이 아님
		 */
		Scanner sc = new Scanner(System.in);
		
		int year = 2000;
		System.out.print("입력: ");
		year = sc.nextInt();
		
		year = year % 4 == 0 
				&& year % 100 != 0 
				|| year % 400 == 0 
				? 1 : 0 ;
		
		System.out.println("결과: " + year);
		
	}

}
