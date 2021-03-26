package P02.lecture;

public class A11TypeConversion {
	public static void main(String[] args) {
		//정수형 :byte , short , int , long
		
		byte byteVar1 =100;
		short shortVar1 = byteVar1;
		int intVar1 = shortVar1;
		intVar1 = byteVar1;
		
		long longVar1 =intVar1;
		longVar1 = shortVar1;
		longVar1 = byteVar1;
		
		int intVar2=200;
		short shortVar2=200;
		//shortVar2 = intVar2; // 안됨  
		
		//강제 형변환하기 (type casting) casting
		shortVar2 = (short)intVar2;
		System.out.println(shortVar2);
		
		
	}
}
