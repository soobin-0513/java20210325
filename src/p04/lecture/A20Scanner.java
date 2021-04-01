package p04.lecture;

import java.util.Scanner;

public class A20Scanner {
	public static void main(String[] args) {
		System.out.println("프로그램시작");
		
		Scanner scanner = new Scanner(System.in);
		
		int a =scanner.nextInt();
		int b =scanner.nextInt();
		//String c =  scanner.nextLine();
		String d =  scanner.next();
		System.out.println(a);
		System.out.println(b);
		//System.out.println(c);
		System.out.println(d);
		
		scanner.close();
		System.out.println("프로그램종료");
	}

	
}
