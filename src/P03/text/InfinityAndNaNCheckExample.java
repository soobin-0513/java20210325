package P03.text;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		double z1 = x/y;
		double z2 = x%y;
		
		System.out.println(Double.isFinite(z1));
		System.out.println(Double.isNaN(z1));
	}
}
