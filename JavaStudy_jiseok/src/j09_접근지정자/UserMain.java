package j09_접근지정자;

import j09_접근지정자.a.Student;
import j09_접근지정자.b.Teacher;

public class UserMain {
//변수의 값을 숨긴것. - 정보은닉 (private로 값을 숨김)
	public static void main(String[] args) {
		Student student  = new Student();
		Teacher teacher = new Teacher();
		
		student.setName("한지석");
		System.out.println(student.getName());

		teacher.setName("김준일");
		teacher.setAddress("부산");
		teacher.setPhone("010-9988-1916");
		teacher.showInfo();
	}

}
