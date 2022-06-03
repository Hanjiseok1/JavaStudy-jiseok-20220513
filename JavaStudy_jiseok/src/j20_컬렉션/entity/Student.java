package j20_컬렉션.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor		//기본생성자를 자동으로 만들어줌
@AllArgsConstructor		//전체생성자를 자동으로 만들어줌

//Data - getter, setter, hashCode(), equals(), toString() 합쳐져있음.
//Arg 라는 뜻은 매개변수를 뜻함
//Constructor 생성자

public class Student {
	private int studentCode;
	private String name;
	private String schoolName;
}
