package j20_컬렉션.ArrayList;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		ArrayList<String> nameList2 = new ArrayList<String>();
		
		
		//리스트에 값 추가 -> add() 메소드 사용
		
		nameList.add("김준일");
		nameList.add("곽나경");
		nameList.add("김서홍");
		nameList.add("최보성");
		nameList.add("박준형");
		nameList.add("감수현");
		nameList.add("유재원");
		
		nameList.add(0, "이동영");	//리스트 중간에 값 삽입 -> add() 메소드 사용

		nameList.set(1, "정유진");	//리스트 내의 해당 인덱스 값 수정
		
		nameList.remove(3);	//리스트 내에서 인덱스로 값 삭제
		
		nameList.remove("강주현");	//리스트 내에서 값을 바로 삭제
		
		nameList2.addAll(nameList);	//리스트에서 리스트로 값 옮기기(깊은 복사)
		//nameList2.addAll(0, nameList2) 원하는 곳에 삽입하여 붙힘
		
		System.out.println(nameList.toString());	//리스트 내의 모든 값 확인 -> toString(생략가능) 메소드 사용
		
		System.out.println(nameList.get(3));	//리스트에서 값 가져오기 -> get(인덱스 번호)
		
		System.out.println(nameList.contains("김준일"));	//리스트 내에서 원하는 값이 있는지 확인
		System.out.println(nameList.contains("이동영"));	//리스트 내에서 원하는 값이 있는지 확인

		if(!nameList.isEmpty()) {	//리스트 내에 값이 하나라도 있으면 비우기
			nameList.clear();
		}
		System.out.println(nameList);
		System.out.println(nameList2);
		
		Object[] objs = nameList2.toArray();	//리스트를 배열로 변환
		for(Object obj : objs) {				//foreach문을 이용하여 다운캐스팅을 사용해야함. 
			System.out.println((String) obj);
		}
	}
}
