package p07.textbook.s070201;

public class DmbCellPhone extends CellPhone {
	//필드
	int Channe1;
	
	//생성자
	
	DmbCellPhone(String model, String color,int channe1){
		this.model = model;
		this.color =color;
		this.channe1=channe1;
	}
	
	//메소드
	void trunOnDmb() {
		System.out.println("체널"+channe1+"번 DMB방송수신을 시작합니다");
	}
	void changeCanne1Dmb(int channe1) {
		System.out.println("채널"+channe1+"번으로 바꿉니다");
	}
	void trunOffDmb() {
		System.out.println("DMB 방송수신을 멈춥니다.");
	}
	
	
}
