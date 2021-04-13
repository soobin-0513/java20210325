package p07.textbook.s070701;

public class ChildExample {
	public static void main(String[] args) {
		Child child =new Child();
		
		Parent parent =child;  //자동으로 타입변환
		parent.method1();
		parent.method2();
		//parent.method3(); child 메소드3 부모는 호출할수없음
	
	}
}
