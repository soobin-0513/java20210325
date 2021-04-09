package p06.lecture.p9encapsulation;

public class Computer {
	String cpu;
	private int ram; //1보다 작으면안됨, private로 필드를 공개하지않으면됨
	
	
	public void setCpu(String cpu) {
		this.cpu=cpu;
	}
	public String getCpu() {
		 return this.cpu;
	}
	
	public void setRam(int ram) {
		if(ram<1) {
			System.out.println("입력할수없습니다");
		}else {
			this.ram=ram;
			
		}
	}
}
