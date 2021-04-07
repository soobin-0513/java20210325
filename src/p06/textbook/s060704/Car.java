package p06.textbook.s060704;

public class Car {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	
	//1 생성자 만들기
	Car(){
		
	}
	
	//2 생성자 만들기
	Car(String model){
		this.model=model;
	}
	
	//3 생성자 만들기
	Car(String model, String color){
		this.model =model;
		this.color=color;
	}
	
	//4 생성자 만들기
	Car(String model, String color, int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	
}
