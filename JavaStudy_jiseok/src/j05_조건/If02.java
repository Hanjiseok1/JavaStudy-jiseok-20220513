package j05_조건;

public class If02 {

	public static void main(String[] args) {
		int score = 95;
		
		if(score == 100) {
			System.out.println("만접입니다.");
		}else if(score > 89) {
			System.out.println("90점 이상입니다.");
		}else if(score > 79) {
			System.out.println("80점 이상입니다.");
		}else {
			System.out.println("...");
		}
		System.out.println("프로그램 종료");
	}
}

