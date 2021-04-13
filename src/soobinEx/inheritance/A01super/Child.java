package soobinEx.inheritance.A01super;

public class Child extends Parent{
	
	int x = 13;
	public void childMethod(){
	      System.out.println("x=" + x);
	      System.out.println("this(자식).x=" + this.x);
	      System.out.println("super(부모).x=" + super.x); // 부모클래스의 멤버변수 x를 말하는것. 출력결과는 5 이다.
	}
}
