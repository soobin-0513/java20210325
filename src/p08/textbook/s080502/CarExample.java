package p08.textbook.s080502;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		System.out.println("-------------------------------------");
		myCar.frontLeftTire=new KumhoTire();
		myCar.frontRigthTire=new KumhoTire();
		
		myCar.run();
	}
}
