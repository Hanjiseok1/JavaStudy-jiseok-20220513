package j20_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapEx {
	
	//Iterator - 반복자 (반복자는 객체 지향적 프로그래밍에서 배열이나 그와 유사한 자료 구조의 내부의 요소를 순회하는 객체이다.)

	public static void main(String[] args) {
		HashMap<Integer, String> studentMap = new HashMap<Integer, String>();
		
		//값 추가
		studentMap.put(20, "김준일");
		studentMap.put(10, "김준이");
		studentMap.put(22, "김준삼");
		studentMap.put(33, "김준사");
		studentMap.put(44, "김준오");
		
		//키 값이 중복될수없음. 중복이 되면 마지막 값에 덮어씌어짐
		System.out.println(studentMap);
		//key값으로 value 가져오기
		System.out.println(studentMap.get(10));
		
		studentMap.put(10, "김준육"); //put - 키값의 위치에 있는 value의 값을 바꿔줌. 또한 키 값이 없을때 추가가 됨.
		studentMap.replace(10, "김준칠"); // replace - 수정할때 사용함.
		
		studentMap.remove(10);// 삭제 시킬때 사용함
		
		Iterator<Integer> iterator = studentMap.keySet().iterator(); //keySet-키값들을 set 형태로 바꿔줌
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			String value = studentMap.get(key);
//			if(value.equals("김준오")) {
//				System.out.println(studentMap.get(key));
//			}
			System.out.println(value);
		}
		
		//람다식 문법(함수형 프로그래밍)
		studentMap.forEach((k, v) -> { 													//(k, v) 여기 위치는 익명함수(함수명이 없음)가 들어감
			System.out.println("key: " + k);
			System.out.println("value: " + v);
			}
		);
		
		System.out.println(studentMap.containsKey(22));
		System.out.println(studentMap.containsKey("김준구"));
		
		
	}

}
