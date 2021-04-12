package soobinEx.inheritance.inheritanceEX;

public class Child extends Parent{
	Child(){	//자식생성자
		super("수빈",10);  //반드시 자식생성자 첫줄에 선언해야함
	}
	
	public static void main(String[] args) {
		Child ch =new Child();
		System.out.println("결과화면2:");
		ch.Print();
	}
}
