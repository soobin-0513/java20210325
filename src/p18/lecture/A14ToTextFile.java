package p18.lecture;


import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class A14ToTextFile {

	public static void main(String[] args) throws Exception {
		String file = "src/p18/lecture/output4.txt";
		Writer wt = new FileWriter(file);
		Scanner scanner = new Scanner(System.in);

		
		
		String line ="";
		while(!line.equals("종료")) {
			System.out.println("입력>");
			line = scanner.nextLine();
			//line 이 저장한 문자열을 output4.text 에 쓰기
			//write시 끝에 enter 추가"\n"
			wt.write(line+"\n");
		}
			
		System.out.println(line);
		
		wt.close();
		scanner.close();
	}

}
