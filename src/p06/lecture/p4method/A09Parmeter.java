package p06.lecture.p4method;

public class A09Parmeter {
	public static void main(String[] args) {
		
	MyClass9 o1= new MyClass9();
	
	o1.method();
	o1.method(0);
	o1.method(1,2);
	o1.method(1.22);
	o1.method(1,"abcd");
	o1.method("abcd",2);
	
	
	}
}
