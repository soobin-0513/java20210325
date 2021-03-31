package p04.lecture;

import java.util.Scanner;

public class A12ForPrimeNumber {
	public static void main(String[] args) {
		//소수 ( prime number) : 약수가 1과 자기자신
		//ex) 2,3,5,7,11,13
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("수 입력>");
		int number = scanner.nextInt(); //키보드입력받기 기달리는중
		
		System.out.println("입력한수 :" +number);
		
		for(int i =2; i<number; i++) {
			if((number % i)==0) {
				System.out.println("소수가아닙니다.");
				scanner.close(); //다른 프로그램 자원을 사용했으면 닫아줘야함
				return;
			}
		}
		System.out.println("소수입니다");
		
		
	}
}
