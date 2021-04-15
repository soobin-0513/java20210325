package p08.textbook.s080505;

public class Bus implements Vehicle {
	@Override
	public void run() {
		System.out.println("버스가 브릉브릉");	
	}
	
	public void checkFare() {
		System.out.println("승차요금을 확인합니다.");
	}
}
