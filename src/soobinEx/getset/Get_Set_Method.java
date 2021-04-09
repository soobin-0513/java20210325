package soobinEx.getset;

public class Get_Set_Method {
	public static void main(String[] args) {
		Get_Set gs =new Get_Set();
		gs.setName("수우우빈");
		gs.setAge(18);
		
		String name =gs.getName();
		System.out.println("그대 이름은:" +name);
		int age =gs.getAge();
		System.out.println("그대 나이는:"+age);
	}
}
