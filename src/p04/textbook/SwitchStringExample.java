package p04.textbook;

public class SwitchStringExample {
	public static void main(String[] args) {
		String positon = "과장";
		
		switch(positon) {
			case "부장":
				System.out.println("700만원입니다.");
				break;
			case "과장":
				System.out.println("500만원");
				break;
			default :
				System.out.println("300만원");
		}
	}
}
