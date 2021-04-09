package p06.lecture.p7package;

import p06.lecture.p7package.package1.MyClass1;
import p06.lecture.p7package.package2.MyClass2;
public class A02Package {
	public static void main(String[] args) {
		//p06.lecture.p7package.package1.MyClass1 o1
		//= new p06.lecture.p7package.package1.MyClass1();
		
		//위에처럼 다 작성안하고 간단하게 작성할려면
		//패키지명 생략할려면, 위에 import로 미리 가져와야함.
		//단축키 : ctrl shift o
		MyClass1 o1 =new MyClass1();
		
		MyClass2 o2 =new MyClass2();
		
		
		MyClass3 o3 = new MyClass3();
	}
}
