package p06.lecture.paAnnotation;

@MyAnootation3
public class A04Annotation {
	@MyAnootation3
	int field;
	
	@MyAnootation3
	A04Annotation() {
		
	}
	
	@MyAnootation3(999)
	public void method1() {
		@MyAnootation3
		int val;
	}
	
	@MyAnootation3(value = 999)
	public void method2() {
		
	}
	
	@MyAnootation3(value = 999, attr1 = 765)
	public void method3() {
		
	}
}
