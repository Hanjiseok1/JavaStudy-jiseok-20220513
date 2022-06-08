package j23_예외처리;
/*
 * 프로그램의 오류
 * 1. 예외(프로그램이 실행 중) RuntimeException
 * 2. 컴파일 에러 -> ex) 드라이버(IOException) : 프로그램이 실행 전에 컴파일 과정 속에서 오류나는 것
 * 3. 버그
 */
public class ArrayException01 {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		
		try {
		for(int i = 0; i < numbers.length + 1; i++) {					//RuntimeException
			System.out.println("index" + i + ": " + numbers[i]);		//오류가 발생할 것 같은 부분에 try로 묶어줌.
			}
		}catch(StringIndexOutOfBoundsException e) {	//catch를 통해 Exception을 잡음.
			System.out.println(e);
			System.out.println("StringIndexOutOfBoundsException 예외가 발생하였음.");
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("지금까지 진행한 작업을 저장합니다.");
		System.out.println("프로그램이 정상적으로 종료되었습니다.");
	}

}
