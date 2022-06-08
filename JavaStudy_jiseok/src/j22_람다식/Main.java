package j22_람다식;

//람다식, 또는 람다 함수는 프로그래밍 언어에서 사용되는 개념으로 익명 함수(匿名函數, Anonymous functions)를 지칭하는 용어이다.
//장점[편집] 필요한 정보만을 사용하는 방식을 통한 퍼포먼스 향상 - 지연 연산을 지원하는 방식[2]을 통하여 효율적인 퍼포먼스를 기대할 수 있다.
//이 경우 메모리상의 효율성 및 불필요한 연산의 배제가 가능하다는 장점이 있다.

public class Main {

	public static void main(String[] args) {
		Math2 m2_1 = new Math2Imlp(); 
		Math2 m2_2 = new Math2() {
			@Override
			public double calc(double value1, double value2) {
				value1 += 2;
				value2 -= 1;
				return value1 * value2;
			}
		};
		//결과가 return 밖에 없을 때 중괄호({}) 생략, 중괄호가 있을 경우 return을 사용해야함 
		Math2 m2_3 = (v1, v2) -> v1 / v2;
		
		Math2 m2_4 = (v1, v2) -> { //람다식을 정의할때 쓰는 중괄호는 클래스의 중괄호가 아님
		v1 += 2;
		v2 -= 1;
		return v1 % v2;
		};
		
		double t = m2_3.calc(10, 2);
		System.out.println(t);
	}

}
