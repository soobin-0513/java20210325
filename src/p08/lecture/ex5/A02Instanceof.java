package p08.lecture.ex5;

public class A02Instanceof {
	public static void main(String[] args) {
		KindaDog d1 = new Malamute();
		
		System.out.println("===객체타입확인===");
		System.out.println("객체 instanceof 타입");
		System.out.println(d1 instanceof KindaDog);
		System.out.println(d1 instanceof Malamute);
		System.out.println(d1 instanceof Pet);
		System.out.println(d1 instanceof Wolf);
		System.out.println("위에 결과가 true가 나오면 강제형변환가능하다는소리");
		
		Malamute m1 = (Malamute) d1;
		Pet p1 =(Pet) d1;
		SledDog s1 = (SledDog) d1;
		//Wolf w1 =(Wolf) d1; 컴파일 에러
		System.out.println("프로그램종료");
	}
}
