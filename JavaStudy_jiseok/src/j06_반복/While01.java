package j06_반복;

public class While01 {

	public static void main(String[] args) {
		int i = 0;
		int result = 0;
		/*
		 * 반복문에서는 보통 후증가를 많이 씀
		 */
		while(i < 100) {
			result = result + (i + 1);
			i++; //조건 변화 수식
			System.out.println(result);
		}
		
	}

}
