package P11.lecture.classClass;

import java.lang.reflect.Constructor;


public class A01Class {
	public static void main(String[] args) throws Exception {
		//클래스는 설계도, 인스턴스를 만들수있음
		MyClass o1 = new MyClass();
		Class c1 =Class.forName("P11.lecture.classClass.MyClass");
		
		System.out.println(c1.getName());
		Field[] fields = c1.getDeclaredFields();
		System.out.println(fields[0].getName());
		System.out.println(fields[1].getName());
		
		System.out.println(fields.length);
		
		Constructor[] constructors = c1.getDeclaredConstructor();
		System.out.println(constructors.length);
		
		Method[] methods = c1.getDeclaredMethod();
		System.out.println(methods.length);
		
	}
}

class MyClass{
	private int field1;
	private int field2;
	
	MyClass(){
		
	}
	MyClass(int param1){
		
	}
	public void method1() {
		
	}
	public void method2() {
		
	}
}

