package p18.textbook;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
	public static void main(String[] args) throws Exception {
		String file ="src/p18/textbook/file.txt";
		FileOutputStream fos = new FileOutputStream(file);
		PrintStream ps = new PrintStream(fos);
		
		ps.println("[프린터 보조 스트림]");
		ps.print("마치 ");
		ps.println("프린터가 출력하는 것 처럼");
		ps.println("테이터를 출력");
		
		ps.flush(); //잠깐 저장한걸 다 흘러보내라
		ps.close();
		fos.close();
	}
}