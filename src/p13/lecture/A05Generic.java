package p13.lecture;

public class A05Generic {
	public static void main(String[] args) {
		MyClass5 o1 = new MyClass5();
		o1.<String>method1();
		o1.<String>method2("java");
		o1.method2("spring");
		o1.<String>method3();
	}
}

class MyClass5{
	public<T> void method1(){
		
	}
	public<T> void method2(T param){
		
	}
	public<T> T method3() {
		return null;
	}
}