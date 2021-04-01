package p04.textbook.exerise;

public class P134Excise03 {
	public static void main(String[] args) {
		//문제 3 번 1~100 3의모든 배수의 합
		int sum=0; //더한값변수
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				sum+=i;
			}
			
		}
		System.out.println(sum);
	}
}
