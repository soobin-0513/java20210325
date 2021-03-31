package p04.textbook;

public class CountinueExample {
	public static void main(String[] args) {
		for(int i =1; i<=10; i++) {
			if(i%2!=0) {         //2로 나눈나머지가0일경우, 즉 홀수를말함
				continue;
			}
			System.out.println(i);
		}
	}
}
