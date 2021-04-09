package p06.lecture.p9access_modifier.package1.copy;

public class MyClass1 {
	public int i;
	private int j;
	int k; // default, package private
	
	public static int a;
	private static int b;
	static int c;
	
	public MyClass1(){
		//전체다 사용가능
	}
	
	 private MyClass1(int i) {
		 //자기자신만 사용가능한 생성자
	}
	MyClass1(int i, int j){
		
	}
	
	
	
	
	private void method1() {
		
	}
	
	public void method2() {
		
	}
	
	void method() {
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
	
	public static void method4() {
		
	}
	
	static void method5() {
		
	}
	
	private void method6() {
		
	}
	
	
	
}
