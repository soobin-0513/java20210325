package P02.textbook;

public class CastingExample {
	public static void main(String[] args) {
		 int intValue= 44032;
		 char charValue =(char) intValue; //4바이트를 2바이트를 담을려면 강제형 변환해야함
		 System.out.println(charValue);
		 
		 
		 long longValue  = 500;
		 intValue =(int) longValue; //문법상으로  작은타입으로 변할때는 꼭 강제형변환햐야함
		 System.out.println(intValue);
		 
		 double doubleValue = 3.14;
		 intValue = (int) doubleValue;
		 System.out.println(intValue);
		 
	}
}
