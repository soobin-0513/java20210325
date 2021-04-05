package p05.textbook;

import java.util.Scanner;

public class ScannerEX {
	public static void main(String[] args) {
		Scanner inputs =new Scanner(System.in);
		System.out.println("nextline으로 입력");
		String a = inputs.nextLine();
		String s = inputs.nextLine();
		String d = inputs.nextLine();
		System.out.println("-----------");
		System.out.println("next으로 입력");
		String q = inputs.next();
		String w = inputs.next();
		String e = inputs.next();
		
		
		System.out.println("nextline으로 입력"+a+s+d);
		System.out.println("next으로 입력"+q+w+e);
		
		inputs.close();
		
//		System.out.println("이름이뭐에요?");
//		String names = inputs.nextLine();
//		System.out.println("당신의 이름은"+names+"이군요");
//		
//		System.out.println("나이는어떻게되세요?");
//		int age = inputs.nextInt();
//		if(age<=20) {
//			System.out.println(age+"세면 아직미성년자이군요");
//		}else {
//			System.out.println(age+"세면 성인이시군요");
//		}
//		
//		System.out.println("전화번호는 어떻게되나요?");
//		String tel =inputs.nextLine();
	
	}
}
