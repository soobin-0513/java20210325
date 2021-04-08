package p06.lecture.p4method;

public class A05Parameter {
	public static void main(String[] args) {
		MyClass5 o1= new MyClass5();
		o1.method1();
		//		()argument, 인수,인자
		o1.method2(4);
		o1.method2(5);
		o1.method3(2,5);
		
		int[]arr1 = {3,4,6};
		o1.method4(arr1);
		System.out.println(arr1[0]);
		o1.method4(new int[] {8,9});
	}
}
