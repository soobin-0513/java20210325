package soobinEx.inheritance;

public class Child extends Parent{	
	//자식클래스 extends 부모클래스
		
	//생성자만들기
		Child(String name, int age){     //Child가 Parent 의 필드를 상속받아서 가능한선언
			this.name=name;
			this.age=age;
		}
		
		public static void main(String[] args) {
			Child ch =new Child("수우우빈",5);
			System.out.println("출력결과:");
			ch.Print();
		}
		

}
