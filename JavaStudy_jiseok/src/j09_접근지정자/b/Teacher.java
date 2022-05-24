package j09_접근지정자.b;
//캡슐화란 클래스 안에 있는 메소드들이 보호되어지는 것.
public class Teacher {
	private String name;
	private String address;
	private String phone;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void showInfo() {
		String _address = createMassege(name, address);
		String _phone = createMassege(name, phone);
		
		System.out.println(_address);
		System.out.println(_phone);
	}
	
	private String createMassege(String name, String value) {
		return name + "님: " + value;
	}
	
}
