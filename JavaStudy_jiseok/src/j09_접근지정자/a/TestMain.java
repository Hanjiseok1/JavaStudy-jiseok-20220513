package j09_접근지정자.a;
//default - 동일 패키지에서만 사용가능 (기본값)
//public - 공개
//private - 비공개
import j09_접근지정자.b.Test2;

public class TestMain {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.aaa = "하이";
		
		Test2 t2 = new Test2();
		t2.ccc = "바이";
	}

}
