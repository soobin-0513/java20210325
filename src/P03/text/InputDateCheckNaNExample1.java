package P03.text;

public class InputDateCheckNaNExample1 {
	public static void main(String[] args) {
		String userInput = "NaN";   //사용자로부터 입력받은값
		double  val = Double.valueOf(userInput);  //입력받은 값을 double 타입으로 변환
		
		
		double currentBalance = 10000.0;
		currentBalance += val;          //currentBalance에 NaN이 저장됨
		System.out.println(currentBalance);
	}
}
