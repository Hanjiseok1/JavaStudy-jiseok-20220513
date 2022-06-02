package j19_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class CMRespDto<T> {
	private int code;
	private String msg;
	private T data;
	
}

//제네릭을 이용해서 상황에 맞게 자료형을 바꿔줄것
