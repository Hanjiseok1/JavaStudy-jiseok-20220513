package j11_배열;

public class Array01 {
	/**
	 * 
	 * 배열(Array)
	 * 연관된 데이터를 하나의 변수에 그룹핑해서 관리하는 기법.
	 * 
	 * 자료형[] 배열변수명 = new 자료형[배열공간의 개수];
	 * int[] numbers = new int [5];
	 * User[] users = new User[3];
	 *
	 */
//참조자료형은 2가지로 나뉨
	/*
	 * Class, [](Array)로 나뉨
	 */
	//배열을 쓰는이유는 반복문을 쓰기위해서
	public static void main(String[] args) {
		//1. 배열의 공간(크기)을 정해서 생성
		int[] numbers = new int[10];
		//2. 배열에 들어갈 값을 미리 정해서 생성
		int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		char[] charcter = {'a', 'b', 'c', 'd', 'e'}; 
		boolean[] booleans = {true, true, true, false, false};
		
		String[] strArray = new String[5];
		String str = "test";//이건 리터럴 주소
		
		System.out.println("numbers의 길이: " + numbers.length);
		System.out.println("strArray의 길이: " + strArray.length);
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("i: " + i);
			System.out.println("numbers: " + numbers[i]);
			System.out.println("numbers2: " + numbers2[i]);
//			System.out.println(strArray[i]);
		}
		
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		numbers[0] = 10;
		numbers[1] = 20;
		System.out.println(numbers[0]);
		
	}

}
