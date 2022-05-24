package 클래스_휴대폰;

public class PhoneMain {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		Phone p2 = new Phone();
		Phone p3 = new Phone();
		
		p1.company = "KT";
		p2.company = "IPhone";
		p3.company = "LG";
		
		p1.model = "갤럭시";
		p2.model = "아이폰";
		p3.model = "Model3";
		
		p1.color = "블랙";
		p2.color = "화이트";
		p3.color = "레드";
		
		p1.showCompanyInfo();
		p2.showCompanyInfo();
		p3.showCompanyInfo();
		
		System.out.println();
		
		p1.showInfoAll();
		p2.showInfoAll();
		p3.showInfoAll();
		
		//String result1 = p1.getPhone();
		//String result2 = p2.getPhone();
		//String result3 = p3.getPhone();
		//System.out.println(result1);
		
		System.out.println(p1.getPhone());
		System.out.println(p2.getPhone());
		System.out.println(p3.getPhone());
		
		System.out.println();
		
		p1.setColor("블루");
		p2.setColor("그레이");
		p3.setColor("그린");
		
		p1.showInfoAll();
		p2.showInfoAll();
		p3.showInfoAll();
	}

}
