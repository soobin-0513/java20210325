package p08.textbook.s080502;

public class Car {
	Tire frontLeftTire = new HankookTire();
	Tire frontRigthTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();


	void run() {
		frontLeftTire.roll();
		frontRigthTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
