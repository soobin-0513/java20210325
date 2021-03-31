package p04.lecture;

public class A08Switch {
	public static void main(String[] args) {
		//switch case : 값이 일치하는 case 문 부터 실행
		//만약 일치하는 case가없으면 default 부터 실행
		//사용할수있는 타입 :byte,short,char,int,String,Enum
		
		int a = 1;
		switch(a) {
		case 1 :
			System.out.println("케이스1");
			break;
		case 2 :
			System.out.println("케이스2");
			break;
		case 3 :
			System.out.println("케이스3");
		}
	}
}
