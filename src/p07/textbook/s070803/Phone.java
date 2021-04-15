package p07.textbook.s070803;

public abstract class Phone {
	public String owner;
	
	public Phone(String owner) {
		this.owner=owner;
	}
	
	public void turnOn() {
		System.out.println("폰 전원을 꼅니다");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다");
	}
}