package p04.textbook.exerise;

public class P135Excise06 {
	public static void main(String[] args) {
		
		for(int i =0; i<5; i++) {
			for(int j =0; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
System.out.println("--------------");		
		String line ="";
		for(int i=0; i<5;i++) {
			line +="*";
			System.out.println(line);
		}
	}
}
