package j08_클래스.휴대폰;
/*
 * 휴대폰에 관한 입출력 프로그램 만들기
 * 1. Phone 클래스를 만든3다.
 * 2. Phone 클래스의 속성(변수) 제조사(company), 모델(model), 색상(color)
 * 3. Phone 클래스의 기능(메소드)
 * showCompanyInfo() -> 000회사에서 제조된 휴대폰입니다.
 * showInfoAll() ->
 * 제조사: KT
 * 모델: 갤럭시
 * 색상: 화이트
 * getPhone() -> return "KT_갤럭시_화이트"
 * setColor() -> 매개변수에 색상을 받아서 color변수의 값을 변경
 * 
 * KT, 갤럭시, 블랙 - setColor(블루)
 * IPhone, 아이폰, 화이트 - setColor(그레이)
 * LG, Model3, 레드 - setColor(그린)
 * 
 */
public class Phone {
	
	String company;
	String model;
	String color;
	
	void showCompanyInfo() {
		System.out.println(company + "회사에서 제조된 휴대폰입니다.");
	}
	
	void showInfoAll() {
		System.out.println("제조사: " + company);
		System.out.println("모델: " + model);
		System.out.println("색상: " + color);
	}
	
	String getPhone() {
		return company + "_" + model + "_" + color;
	}
	
	void setColor(String color) {
		this.color = color;
	}
	

}
