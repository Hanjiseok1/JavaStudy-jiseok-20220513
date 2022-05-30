package j15_인터페이스;

public class SmartPhone {
	
	private final Hdmi hdim;
	
	public SmartPhone(Hdmi hdmi) {
		this.hdim = hdmi;
	}
	
	public void powerOn() {
		System.out.println("스마트폰의 전원을 켭니다.");
		hdim.connect();
	}
	
	public void powerOff() {
		System.out.println("스마트폰의 전원을 끕니다.");
		hdim.disconnect();
	}
	
}
