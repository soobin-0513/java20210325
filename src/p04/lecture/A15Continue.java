package p04.lecture;

public class A15Continue {
	public static void main(String[] args) {
		//continue : loop의 나머지 코드를 실행하지 않고 계속진행
		
		for(int i =0; i<10; i++) {
			if((i%2)==0) {
				continue;  //i가 짝수일때만 만남
			}
			System.out.println(i);
		}
	}
}
