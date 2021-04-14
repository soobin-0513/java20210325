package soobinEx.abstractpackage;

public abstract class Animal {
	//필드
	 public String kind;
	//생성자
	//메소드
	public void volume(){
	   System.out.println("소리소리소리");
	} 
	//추상메소드
	public abstract void sound();  //구체적인 구현부는 없다

}
