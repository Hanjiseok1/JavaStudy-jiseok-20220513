package j22_람다식;

//람다식, 또는 람다 함수는 프로그래밍 언어에서 사용되는 개념으로 익명 함수(匿名函數, Anonymous functions)를 지칭하는 용어이다.
//장점[편집] 필요한 정보만을 사용하는 방식을 통한 퍼포먼스 향상 - 지연 연산을 지원하는 방식[2]을 통하여 효율적인 퍼포먼스를 기대할 수 있다.
//이 경우 메모리상의 효율성 및 불필요한 연산의 배제가 가능하다는 장점이 있다.

public class Main {

	public static void main(String[] args) {
		Math<Integer, Integer> plusLamda = (v1, v2) -> v1 + v2;
		System.out.println(plusLamda.calc(10, 20));

		Math<Integer, Double> plusLamda2 = (v1, v2) -> {
			System.out.println("v1: " + v1);
			System.out.println("v2: " + v2);
			return v1 + v2;
			};
		System.out.println(plusLamda2.calc(30, 40.5));
	}

}
