package P03.lecture.p1unary;

public class A02IncDec {
	public static void main(String[] args) {
		// 증가 연산자
		// ++ : 변수에 1더한 값을 다시 변수에 할당
		
		int x = 5;
		x++;
		System.out.println(x);
		
		// 감소 연산자
		// -- : 변수에 1뺀 값을 다시 변수에 할당
		x--;
		System.out.println(x);
		
		/////////////////
		//연산자가 앞에 있을때
		//++x; //밑에처럼 작성하는게 좋음
		x= x + 1;;
		System.out.println(x);
		
		int y = 5 +(++x);
		System.out.println(y);
		
		////////////
		//연산자가 뒤에있을때 , 다른연산을 한이후에 연산이됨.
		System.out.println(x);
		y= 5 + (x ++);  //가능한 이렇게 복잡하게 작성하면 안됨
		System.out.println(y);
		
		
	}
}