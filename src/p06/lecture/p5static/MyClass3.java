package p06.lecture.p5static;

public class MyClass3 {
	
	static void method1() {
		System.out.println("static---methoud1()");
		method3();
		//this.meshod3(); 안됨 instance member 만 사용가능, static member접근불가
		//meshod4();
	}
	static void method3() {
		System.out.println("static---methoud3()");
		
	}
	
	void method2() {
		System.out.println("인스턴드---methoud2()");
		this.method4();
		//instance member 는 static member(필드랑메소드묶은거) 접근가능/ 반대로는안됨
		
		method3();
	}
	
	void method4() {
		System.out.println("인스턴드---methoud4()");
	}
	
}
