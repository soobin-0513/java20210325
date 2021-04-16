package p09.lecture;

public class A03Access {
	
	
	class NonStaticClass{
		
	}
	static class StaticClass{
		
	}
	
	NonStaticClass o1 = new NonStaticClass();
	StaticClass o2 = new StaticClass();
	
	//static NonStaticClass o4 = new NonStaticClass();
	
	
	
	void instanceMethod() {
		//non-static(instance)member는 static 접근가능
		staticMethod();
	}
	
	static void staticMethod() {
		//static member는 non-static(instance)접근불가
	//	instanceMethod(); 
		//static에서는 인스턴드메소드 사용못해
	
	}
}
