package j23_예외처리;

public class ValidationCustomException extends RuntimeException {

	/**
	 * 직렬화 - 자바 시스템 내부에서 사용되는 Object 또는 Data를 외부의 자바 시스템에서도 사용할 수 있도록 byte 형태로 데이터를 변환하는 기술
	 */
	private static final long serialVersionUID = 1L;

	public ValidationCustomException() {
		super();
		System.out.println("우리가 만든 예외");
	}
	public ValidationCustomException(String message) {
		super(message);
		System.out.println("우리가 만든 예외 메세지 있음.");

	}
	
}
