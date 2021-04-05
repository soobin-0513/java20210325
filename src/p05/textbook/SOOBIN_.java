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
		//int tNum =sc.nextInt();
		String tNum=sc.nextLine();
		//String tNum=sc.next();
		
		
		System.out.println("이름:"+names);
		
		if(age<=20) {
			System.out.println(age+"세는 미성년자입니다.");
		}else {
			System.out.println(age+"세는 성인입니다.");
		}
		
		System.out.println("전화번호:"+tNum);
		
		
		
		sc.close();
	}
}
