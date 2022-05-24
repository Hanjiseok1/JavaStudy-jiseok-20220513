package j09_접근지정자.a;

public class Student {
	private String name;
	private String schoolName;
	
	//setter - 자료형이 같아야함.
	public void setName(String name) {
		this.name = name;
	}
	
	//getter - 안에 들어있는값을 들고오는 역할(매개변수가 필요없음), return 자료형이 String 이어야함.
	public String getName() {
		return name;
	}
	
}
