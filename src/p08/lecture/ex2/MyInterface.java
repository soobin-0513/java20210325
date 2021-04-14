package p08.lecture.ex2;

public interface MyInterface {
	//필드
	//-> public static final 필드
	public static final int My_FIELD1=1;
	int My_FIELD2=2; //앞에 생략가능 
	String My_FIELD3="Hellow";
	
	//생성자는 못가짐, interface은 인스턴드 못만들어
	
	//메소드 - > 
	//public static(클래스 메소드),
	public static void staticMethod1() {
		System.out.println("staticMethod1");
	}
	static void staticMethod2() {
		System.out.println("static method2");
	}
	
	
	//public abstract(인스턴스 메소드),   추상메소드는 몸통{}을 가지고있으면안됨. 인스턴스를 각각가지고있는메소드
	public abstract void method1();
	void method2();  //public abstract생략가능
	
	//public default(인스턴스 메소드)
	public default void defaultMethod1() {
		System.out.println("defaultMethod1");
	}
	default void defaultMethod2() {
		System.out.println("defaultMethod2");
	}
	
	

}
