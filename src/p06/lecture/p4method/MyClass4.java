package p06.lecture.p4method;

public class MyClass4 {
	
	void method1(){
		System.out.println("이건method1 호출이야");
	}
	
	int method2() {
		System.out.println("요건 method2 호출이야");
		
		return 5;  //종료하다 뜻이있으며, 리턴후에 작성하면안됨 주의하세용
	}
	
	String method3(){
		System.out.println("이것은 method3 호출");
		return "";
	}
	
	int[] method4() {
		System.out.println("method4[배열]호출");
		return new int[]{};
	}
	
	int[] method5() {
		System.out.println("지금호출한건 method5[배열]");
		int[] res= {};
		
		return res;
	}
	String method6() {
		System.out.println("이줄은 method6 호출");
		boolean b = 3<5;
		
		if(b) {
			return "hello";
		}else {
			return "hello";
		}
	}
	
	String method7() {
		
		System.out.println("이건은method7 호출...");
		
		boolean c = 3 < 5;
		
		if (c) {
			return "world";
		}
		
		System.out.println("애도method7 호출2...");
		return "world";
	}
	
}
