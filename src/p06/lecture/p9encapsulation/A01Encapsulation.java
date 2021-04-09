package p06.lecture.p9encapsulation;

public class A01Encapsulation {
	//캡슐화 (encapsulation)
	//필드를 private
	//메소드 public
	
	//관련 속성과 기능을 하나의 클래스로 묶는거
	public static void main(String[] args) {
		Computer com1 =new Computer();
		//com1.ram= 4; private때문에 안됨 
		//com1.ram= 1; private때문에 안됨
		
		com1.setRam(4);
		com1.setRam(1);
		
	//	System.out.println(com1.ram);
	}
}
