package j17_스태틱.싱글톤;
/*
 * 싱글톤
 * 1. 유일한 객체(인스턴스)를 생성해야한다.
 */
public class SinglrtonMain {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		singleton.setCount(10); 
		singleton.printInfo();
		
		Singleton singleton2 = Singleton.getInstance();
		singleton2.setCount(20); 
		singleton2.printInfo();
	}

}
