package P03.text;

public class CompareOpearatorExample1 {
	public static void main(String[] args) {
		int num1= 10;
		int num2 = 10;
		boolean result1 =(num1 == num2);
		boolean result2 =(num1 !=num2);
		boolean result3 = (num1 <=num2);
		
		System.out.println("resul1="+result1);
		System.out.println("resul2="+result2);
		System.out.println("resul3="+result3); 
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);
		System.out.println("result4="+result4);
	}
}
