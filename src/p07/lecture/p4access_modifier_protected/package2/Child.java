package p07.lecture.p4access_modifier_protected.package2;

import p07.lecture.p4access_modifier_protected.package1.Parent;

public class Child extends Parent {
	public void chidlMethod() {
		
		publicMethod();
		protectedMethod();
		//defaultMethod();
		//privateMethod();
	}
}