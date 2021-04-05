package p05.textbook;

import java.util.Scanner;

public class SOOBIN_ {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("이름을 입력하세요");
		String names=sc.nextLine();
		
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
		System.out.println("전화번호를 입력하세요");
		int tNum =sc.nextInt();
		
		System.out.println("이름:"+names);
		System.out.println("나이:"+age);
		System.out.println("전화번호:"+tNum);
		
		
		sc.close();
	}
}
