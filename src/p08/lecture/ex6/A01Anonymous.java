package p08.lecture.ex6;

public class A01Anonymous {
	public static void main(String[] args) {
		MyInterface i1;
		i1= new MyClass();
		
		//클래스와 인스턴스를 한번에 만들수있음
		//무명클래스 **(anonymous class)
		
		MyInterface i2;
		i2 = new MyInterface() {
			//{}안에는 MyInterface 구현하는 클래스 몸통
			@Override
			public void method1() {
				System.out.println("anonymous class method1");
			}
		};
		
		i1.method1();
		i2.method1();
	}
	
	}
