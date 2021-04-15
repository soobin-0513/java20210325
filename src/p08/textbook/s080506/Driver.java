package p08.textbook.s080506;

public class Driver {
	public void darive(Vehicle vehicle) { //Vehicle타입을 vehicle로받음
		if(vehicle instanceof Bus) { // vehicle참조값이 Bus타입이면
			Bus bus =(Bus) vehicle;  //vehicle bus로 강제타입변환
			bus.checkFare();
		}
		vehicle.run();
	}
}	
