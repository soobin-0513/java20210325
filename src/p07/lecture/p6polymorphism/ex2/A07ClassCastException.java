package p07.lecture.p6polymorphism.ex2;

public class A07ClassCastException {
	public static void main(String[] args) {
		KindaCat k1 = new Tiger();
		
		Tiger t1 =(Tiger)k1;  //강제형변환
	//	Cat c1 = (Cat) k1; //위험한 코드 컴파일러에서도 잡아주지않음
		System.out.println("프로그램 종료..");
	}
}
