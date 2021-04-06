package p06.lecture.p3constructor;
//생성자 (Constructor)
//객체(instance)가 생선될 때 해야하는 일들이 작성되는 코드 블럭
//주로 필드를 초기화 하는데 사용됨

// 생산자명은 클래스명과 같다
//다른 파라미터를 갖는 여러 생성자가 만들어 질 수 있음

public class A01Constructor {
	
	public static void main(String[] args) {
//		Car car1 = new Car();
//		car1.name= "Tesla";
//		car1.model = "model3";
//		
//		Car car2=new Car();
//		car2.name="bmw";
//		car2.model="model7";
		
		Car car1 = new Car("tesla","model3");
		System.out.println(car1.name);
		System.out.println(car1.model);
	}
}
