package p05.lecture;

public class A13CallByValue {
	public static void main(String[] args) {
		System.out.println("main statment1");
		
		method1();
		
		System.out.println("main statment2");
		
		method1();
		method2(5);
	}
	
	public static void method1() {
		System.out.println("method1 statement1");
		System.out.println("method1 statement2");
	}
	public static void method2(int i) {
		System.out.println("method2 statement1");
		System.out.println(i);
		System.out.println("method2 statement2");
	}
}
