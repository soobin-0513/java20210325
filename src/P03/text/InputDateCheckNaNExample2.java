package P03.text;

public class InputDateCheckNaNExample2 {
	public static void main(String[] args) {
		String userInput = "NaN";   //사용자로부터 입력받은값
		double  val = Double.valueOf(userInput);  //입력받은 값을 double 타입으로 변환
		
		doube currentBalance = 10000.0;
		
	    if(Double.isNaN(val)) {
	    	System.out.println("NaN이 입력되어처리 할 수 없음");
	    	val = 0.0;
	    }
	    currentBalance+= val;
	    System.out.println(currentBalance);
	}
}
