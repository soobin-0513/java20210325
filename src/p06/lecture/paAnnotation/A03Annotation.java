package p06.lecture.paAnnotation;

import p05.textbook.exercise.s050702.Week;

public class A03Annotation {
	@MyAnnotation2(value="java",attr1=3,attr2= {3,4,5},
				attr3= {"java","GO"},attr4=Week.MONDAY,
				attr6="spring")
	
	public void method() {
		
	}
}
