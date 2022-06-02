package j18_최상위클래스.entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@EqualsAndHashCode
@ToString

//Arg 라는 뜻은 매개변수를 뜻함
//Constructor 생성자

public class Product2 {
	
	@NonNull //NonNull 값이 null일수가 없다라는 뜻
	private int productCode;
	@NonNull
	private String productName;
	private int category;
	private LocalDate productionDate;

}
