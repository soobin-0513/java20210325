package p06.textbook.s061101;

public class PersonExample {
	public static void main(String[] args) {
		
	Person p1 = new Person("123456-123456","계백");
	
	System.out.println(p1.nation);
	System.out.println(p1.ssn);
	System.out.println(p1.name);
	
	/* final은 필드값 수정불가
	p1.nation="usa";
	p1.ssn="6789321-234563";
	*/
	p1.name="을지문덕";
	
	
	}
}
