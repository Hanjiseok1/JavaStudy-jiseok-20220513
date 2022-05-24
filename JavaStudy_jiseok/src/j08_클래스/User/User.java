package j08_클래스.User;

public class User {
	String name;
	String age;
	String phone;
	String address;
	
	User() {//기본생성자
		System.out.println("생성");
	}
//	오버로딩이란 - 매개변수가 다른것을 의미함, 리턴 자료형이 다르다고 해서 오버로딩이 되지는 않음.
	User(String name) {//사용자정의 생성자
		this.name = name;
	}
	
	User(String name, String age, String phone, String address){ //생성하는시점에서 값을 넣겠다라는 뜻.
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
//	void test() { // 메소드는 무조건 앞에 void(반환자료형) 명시해야함
//		
//	}
	
	void setName(String name) {
		System.out.println("setName 메소드 안에서 호출: " + this);
		this.name = name;
	}
}
