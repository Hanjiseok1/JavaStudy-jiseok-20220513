package j06_반복;

public class For04 {
	
	/*
	 * 구구단 2단부터 9단까지 출력해보기
	 * 2 3 4 5 6 7 8 9
	 */

	public static void main(String[] args) {
		
		for(int dan = 0; dan < 8; dan++) {
			
			System.out.println((dan + 2) + "단");
			
			for(int i = 0; i < 9; i++) {
				int result = (dan + 2) * (i + 1);
				System.out.println((dan + 2) + " x " + (i + 1) + " = " + result);
			}
			System.out.println();
		}
	}

}
