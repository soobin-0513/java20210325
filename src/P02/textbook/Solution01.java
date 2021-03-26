package p02.textbook.exercise;

public class Solution01 {
	public static void main(String[] args) {
		// 1번문제: 4
		int v = 3;
		
		System.out.println(v);
		
		// 2번문제;
		int modelName; 
//		int class; 
//		int 6hour;
		int $value;
		int _age;
//		int int;
		
		// 3번문제;
		
		// 1byte        2byte         4byte          8byte
		// 정수
		// byte         short,char    int            long
		// 실수
		//                            float          double
		// 논리
		// boolean
		
		
		// String 문자열 ""
		
		/////////////////////////////////
		// 4번 문제
		int age;
		age = 10;
		double price = 3.14;
		
		// 타입: int, double
		// 변수명: age, price
		// 리터럴: 10, 3.14
		
		
		
		
		//////////////////
		//5번문제 
		
		byte byteValue=10;
		char charValue='A';
		
		int intValue5 = byteValue;
		System.out.println(intValue5);
		
		int intValue501 = charValue;
		System.out.println(intValue501);
		
		//short shortValue = charValue; //char은 문자코드를 담기 때문에 안됨
		//System.out.println(shourtValue);
		
		double doubleValue = byteValue;
		
		///////////////
		//6번문제
		int intValue6 = 10;
		char charValue6 = 'A';
		double doubleValue6 = 5.7;
		String strValue="A"; //참조타입 

		
		double var1 = (double) intValue6; //int는 double로 자동으로 형변환됨, 굳이 변환안해도됨.
		System.out.println(var1);
		
		byte var2 = (byte) intValue6;
		
		int var3 = (int) doubleValue6;
		
		//		기본타입과 참조타입은 기본적으로 서로 형변환 할수가 없음 , 예외도있긴함.		
		//char var4 = (char) strValue; //안됨
		
		
		
		
		
		/////////////
		// 7번 문제;
		
		int var4 = 10;
		long var5= 10000000000000L;
//		char var6 = '';
		double var6 = 10;
		float var7 = 10;
		
		/////////////////
		//8번

		
		byte byteValue8 = 10;
		float floatValue8 = 2.5F;
		double doubleValue8 = 2.5;
		
		//byte result1 = byteValue8 + byteValue8; 
		//안됨 강제형 변환해야함
		//byte, short, int 끼리 연산은 int, int를 byte에 담을수 없음!
		
		int result2 = 5 + byteValue8;
		
		float result3 = 5 + floatValue8;
		
		double result4 = 5+ doubleValue8;
		
		
		
	}
}





