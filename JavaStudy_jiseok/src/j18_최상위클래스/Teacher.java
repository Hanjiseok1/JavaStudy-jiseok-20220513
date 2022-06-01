package j18_최상위클래스;

import java.util.Objects;

/*
 * Object class(최상위 클래스)(Object = 모든 객체를 의미함)
 * 
 */

public class Teacher {
	
	private String name;
	private String subject;
	private int age;
	
	public Teacher(String name, String subject) {
		super();
		this.name = name;
		this.subject = subject;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Teacher) {
//			Teacher teacher = (Teacher) obj; // 다운캐스팅
//			
//			if(this.name.equals(teacher.name) && this.subject.equals(teacher.subject) && this.age == Teacher.age) { //문자열 비교할때는 이퀄스
//					return true;
//				}
//			}
//		return false;
//	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name, subject);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) //getClass - 오브젝트클래스안에 들어있는 것을 말함 또한 클래스객체는 자료형이다, 클래스내부에 있는 정보들을 말한다.
										  // getClass() != obj.getClass() - instnaceof랑 동일한 역할을함
			return false;
		Teacher other = (Teacher) obj;
		return age == other.age && Objects.equals(name, other.name) && Objects.equals(subject, other.subject);
	}
	
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", subject=" + subject + "]";
	}
	
	public void classInfo() {
		System.out.println();
	}
	
//	@Override
//	public String toString() {
//		return super.toString(); // 부모의 toStrign 메소드를 호출할수있다.
//		return "이름: " + name + ", 과목: " + subject;
//	}
	
	
}
