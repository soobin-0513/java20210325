package p06.lecture.p4method;

public class MyClass1 {
	//fields
	int age;
	String name;
	
	
	//constructors
	MyClass1(){
		
	}
	MyClass1(String name){
		this.name=name;
	}
	
	//method
	/* 
  리턴타입 메소드명 (파라미터리스트) {
		실행될 명령문들...
		}
	 */
	//method명 -> $,_,영문대소문자,숫자조합
	//				숫자맨앞에 오면 안됨
	// 작명관습:	loweCamelCase
	
	//파라미터 목록 : [타입 명], [타입 명]
	//					0개 이상 작성가능
	
	//리턴타입->
	//	메소드가 반환하는 값의 타입
	//	void 일 경구 반환 하지않아도 됨
	
	void method1(String parma1, int parama2){
		//statements....
		System.out.println("method1 호출");
	}	
	int method2() {
		System.out.println("method2 호출!");
		return 3;
	}
}
