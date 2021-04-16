package p09.lecture;

public class A04LocalClassAccess {
	void method() {
		//param과 localVar는 묵시적 final(effectively fianl)
		final int localVar = 3;
		// final 있던없던 lovalClass에 사용했기때문에 값을 변경못함
//		localVar = 4;
//		param = 1;
		
		class LocalClass{
			 void method1() {
				 System.out.println(lovalVar);
			 }
		}
	}
}
