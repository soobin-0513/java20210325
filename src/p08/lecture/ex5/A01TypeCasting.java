package p08.lecture.ex5;

public class A01TypeCasting {
	public static void main(String[] args) {
		Malamute dog1 = new Malamute();
		dog1.bark();
		dog1.sit();
		dog1.pull();
		
		System.out.println("=============");
		Pet p1 =dog1;
		//p1.bark();
		p1.sit();
		//pi.pull();
		
		System.out.println("=============");
		SledDog s1= dog1;
		//s1.bark();
		//s1.sit();
		s1.pull();
		
		System.out.println("=============");
		KindaDog k1 =dog1;
		k1.bark();
		//k1.sit();
		//k1.pull();
		
		System.out.println("==강제타입변환===");
	//구현클래스 변수 = (구현클래스) 인터페이스변수
		Malamute dog2 = (Malamute) k1; 
		dog2.bark();
		dog2.sit();
		dog2.pull();
		
		System.out.println("==강제타입변환===");
		Wolf w1 =(Wolf) k1;
		w1.bark();
		System.out.println("프로그램 종료");
	}
}
