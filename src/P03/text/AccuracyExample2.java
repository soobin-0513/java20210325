package P03.text;

public class AccuracyExample2 {
	public static void main(String[] args) {
		int apple = 1;
		
		int totalPieces = apple *10;
		double pieceUnit = 0.1;
		int number = 7;
		
		double temp = totalPieces - number;
		double result = temp/10.0;
		System.out.println("사과한개에서");
		System.out.println("0.7조각을 빼면,");
		System.out.println(result + "조각이 남는다");
	}
}
