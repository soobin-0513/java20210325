package p10.textbook.s100301;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		System.out.println("프로그램실행!");
		try {
			System.out.println("try 블럭실행");
			Class clazz = Class.forName("java.lang.String2");
			System.out.println("try 블럭종료");
		}catch(ClassNotFoundException e) {
			System.out.println("catch 블럭실행");
			System.out.println("클래스가 존재하지않습니다.");
			System.out.println("catch 블럭종료");
		}
		System.out.println("프로그램 종료");
	}
}
