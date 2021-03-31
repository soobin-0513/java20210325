package p04.textbook;

public class ForSum1To100Example {
	public static void main(String[] args) {
		int sum =0;
		
		int i = 0;
		for(i=1;i<=100;i++) {
			sum=sum+i;
		}
		
		System.out.println("1~"+(i-1)+"합:"+sum);
	}
}
