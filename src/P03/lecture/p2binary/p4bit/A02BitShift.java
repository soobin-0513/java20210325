package P03.lecture.p2binary.p4bit;

public class A02BitShift {
	public static void main(String[] args) {
		// bitshift 
		//left shift  << : 왼쪽으로 비트 이동
		//					(오른쪽으로 0 으로 채움)
		//right shift >> : 오른쪽으로 비트 이동
		//					(왼쪽비트는 부호비트로 채움)
		
		// right shift >>> : 오른쪽으로 비트 이동
		//					(왼쪽비트는 0으로 채움)
		
		
		//left shift  <<
		int a =99; // 0110 0011
		// a<<1    // 1100 0110
		int b = a <<1;
		System.out.println(b);
		
		b= a<<2;   // 01 1000 1100
		System.out.println(b);
		
		//a =99;    // 0110 0011
		//right shift >>
		// a >> 1  //  0011 0001
		// a >> 2  //  0001 1000
		System.out.println(a>>1);
		System.out.println(a>>2);
	}
}
