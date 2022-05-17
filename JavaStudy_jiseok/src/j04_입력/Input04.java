package j04_입력;

import java.util.Scanner;

public class Input04 {

	public static void main(String[] args) {
		/*
		 * 닥터스트레인지 영화 적어보기(줄거리 포함)
		 */
		Scanner sc = new Scanner(System.in);
		
		String summary = null;
		int time = 0;
		String director = null;
		String grade = null;
		String popularity = null;
		String story = null;
		
		System.out.print("개요: ");
		summary = sc.next();
		System.out.print("상영시간: ");
		time = sc.nextInt();
		System.out.print("감독: ");
		director = sc.next();
		System.out.print("등급: ");
		grade = sc.next();
		System.out.print("흥행: ");
		popularity = sc.next();
		System.out.print("줄거리: ");
		
	}

}
