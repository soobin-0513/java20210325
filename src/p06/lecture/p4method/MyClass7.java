package p06.lecture.p4method;

import java.util.Arrays;

public class MyClass7 {
	void method1(int i) {
		System.out.println("method1`호출하기");
	}
	void method2(int i, int j) {
		System.out.println("method2``호출하기");
	}


	// varargs...타입여러개를 받겠다
	void method3(int... i) {
		System.out.println("method3###");
		System.out.println(i.length);
		System.out.println(Arrays.toString(i));
	}
	
	void method4(double d, int... i) {
		System.out.println("method4$$$");
		
	}
}
