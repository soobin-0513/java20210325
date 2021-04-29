package p07.textbook.s070201;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		//객체생성
		DmbCellPhone dmbCellPhone =new DmbCellPhone("자바폰","검정",10);
		
		//CellPhone 으로부터 상속받은 필드
		System.out.println("모델:"+dmbCellPhone.model);
		System.out.println("색상:"+dmbCellPhone.color);
	
			
		//DmbCellPhone의 필드
		System.out.println("채널:"+dmbCellPhone.channe1);
	
		//CellPhone으로부터 상속받은 메소드 호풀
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		
	}
	
	
}
