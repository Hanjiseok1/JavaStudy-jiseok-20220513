package j08_클래스.자동차;

/*
 * 자동차에 관한 입출력 프로그램 만들기
 * 1. Car 클래스를 만든3다.
 * 2. Car 클래스의 속성(변수) 제조사(company), 모델(model), 색상(color)
 * 3. Car 클래스의 기능(메소드)
 * showCompanyInfo() -> 000회사에서 제조된 차량입니다.
 * showInfoAll() ->
 * 제조사: KIA
 * 모델: K5
 * 색상: 화이트
 * getCar() -> return "KIA_K5_화이트"
 * setColor() -> 매개변수에 색상을 받아서 color변수의 값을 변경
 * 
 * KIA, K7, 블랙 - setColor(블루)
 * 현대자동차, 소나타, 화이트 - setColor(그레이)
 * Tesla, Model3, 레드 - setColor(그린)
 * 
 */

public class CarMain {
	
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		c1.company = "KIA";
		c2.company = "현대자동차";
		c3.company = "Tesla";
		
		c1.model = "K7";
		c2.model = "소나타";
		c3.model = "Model3";
		
		c1.color = "블랙";
		c2.color = "화이트";
		c3.color = "레드";
		
		c1.showCompanyInfo();
		c2.showCompanyInfo();
		c3.showCompanyInfo();
		
		System.out.println();
		
		c1.showInfoAll();
		c2.showInfoAll();
		c3.showInfoAll();
		
		System.out.println(c1.getCar());
		System.out.println(c2.getCar());
		System.out.println(c3.getCar());
		
		System.out.println();
		
		c1.setColor("블루");
		c2.setColor("그레이");
		c3.setColor("그린");
		
		c1.showInfoAll();
		c2.showInfoAll();
		c3.showInfoAll();
	}
}
