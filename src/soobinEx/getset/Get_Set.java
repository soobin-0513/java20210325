package soobinEx.getset;

public class Get_Set {
	//private 은닉된 멤버 변수 --> 현재 블록에서만 접근가능!
	private String name;
	private int age;
	
	//은닉된 멤버변수에 값을 넣는 방법 --> Set메소드를 사용 
	//								Source 메뉴에서 간편하게 출력가능 

	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	///은닉된 멤버변수에 값을 읽는 방법 --> Get메소드를 사용 
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
	

}
