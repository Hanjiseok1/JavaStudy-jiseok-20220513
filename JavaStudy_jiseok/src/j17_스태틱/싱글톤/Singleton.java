package j17_스태틱.싱글톤;
/*
 * 싱클톤
 * 1. 생성자는 private으로 지정하여 외부에서 생성할 수 없게 만들어야한다.
 * 2. 싱글톤으로 설계된 클래스의 유일한 instance를 return해줄 수 있는
 * 	  getInstance() static 메소드가 존재해야 한다.
 * 3. 싱글톤 instance를 저장할 변수명이 instance인 static변수가 존재해야 한다.
 */
public class Singleton {
	private static Singleton instance = new Singleton();
	private int count;
	
	private Singleton() { // 생성자는 무조건 private로 줄것(유일한 객체)
		
	}
	
	public static Singleton getInstance() {
		// 스태틱에서는 스태틱 변수만 사용할수있다.
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void printInfo() {
		System.out.println("싱글톤 테스트" + count);
	}
}
