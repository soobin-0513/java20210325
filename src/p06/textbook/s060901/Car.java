package p06.textbook.s060901;

public class Car {
	String model;
	int speed;

	Car(String model){
		this.model =model;		
	}
	
	void setSpeed(int speed) {
		this.speed=speed;
	}
	void run() {
		for(int i =10; i<=50; i+=10) {
			this.setSpeed(i);
			//this.setSpeed(100);
			System.out.println(this.model+"가 달립니다.(시속:"+this.speed+"km/h)");
		}
	}
}
