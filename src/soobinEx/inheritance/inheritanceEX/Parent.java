package soobinEx.inheritance.inheritanceEX;

public class Parent {

		String name;
		int age;
		
		public Parent(String name, int age) {
			this.name=name;
			this.age=age;
		}
		public void Print() {
			System.out.println("이름 과 나이:"+name+" "+age+"세");
			
		}
}
