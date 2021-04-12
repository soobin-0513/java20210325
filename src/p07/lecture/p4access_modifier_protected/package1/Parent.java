package p07.lecture.p4access_modifier_protected.package1;

public class Parent {
	
	public void publicMethod(){
		System.out.println("publicMethod");
	}
	
	protected void protectedMethod() {
		System.out.println("protectedMethod");
	}
	
	void defaultMethod() {
		System.out.println("defaultMethod");
	}
	
	private void privateMethod(){
		System.out.println("privateMethod");
	}
}
