package j18_최상위클래스;

import java.util.Scanner;

public class StringObj {

	public static void main(String[] args) {
		String name = "김준일";
		String name2 = "김준일";
		
		System.out.println(name == name2); //true 가 나오는 이유는 위에서 김준일은 리터럴 주소로 들어가서 그럼

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름1: ");
		name = scanner.nextLine();
		
		System.out.print("이름2: ");
		name2 = scanner.nextLine();
		
		System.out.println(name == name2);
		
		name = new String("김준일");
		name2 = new String("김준일");
		
		System.out.println(name == name2); // 이건 주소값비교
		System.out.println(name.equals(name2)); // true로 나오게하려면 이퀄스를 사용해야함. 이건 값(매개변수)을 비교 
	}

}
