package j20_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

import j20_컬렉션.entity.Student;

public class HashSetEx2 {

	public static void main(String[] args) {
		
		/*
		 * HashSet<Student>
		 * 
		 * 20220001, 김준일, 부산대학교
		 * 20220002, 김준이, 부경대학교
		 * 
		 * 20220002의 코드를 가진 학생을 조회
		 * 
		 * 20220001의 코드를 가진 학생을 삭제
		 */
		
		HashSet<Student> student = new HashSet<Student>();
		
		student.add(new Student(20220001, "김준일", "부산대학교"));
		student.add(new Student(20220002, "김준이", "부경대학교"));
		
		System.out.println(student);
		
		Iterator<Student> iterator = student.iterator();
		while(iterator.hasNext()) {
			Student student1 = iterator.next();
			if(student1.getStudentCode() == 20220002){ // 정수일떄 == 사용 문자열일때는 이퀄스 사용 
				System.out.println(student1);
			}
		}
		iterator = student.iterator();
		while(iterator.hasNext()) {
			Student student1 = iterator.next();
			if(student1.getStudentCode() == 20220001){
				student.remove(student1);
			}
		}
		System.out.println(student);
	}
}
