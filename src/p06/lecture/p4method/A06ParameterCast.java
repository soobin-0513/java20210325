package p06.lecture.p4method;

public class A06ParameterCast {
	public static void main(String[] args) {
		int a =5;
		double b;
		b=a;
		MyClass6 o1=new MyClass6();
		o1.method1(a);
		//o1.method1(b);//method1에 double타입없어서 안됨
		o1.method2(b);
		o1.method2(a); //int가 double타입에 자동으로 형변환가능
	}
}
