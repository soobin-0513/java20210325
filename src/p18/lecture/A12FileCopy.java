package p18.lecture;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class A12FileCopy {
	public static void main(String[] args) throws Exception {
		//파일 복사 Reader, Writer 이용
		
		String src ="src/p18/lecture/A12FileCopy.java";
		String des ="src/p18/lecture/A12FileCopy.copy";
		
		Reader fr = new FileReader(src);
		Writer fw = new FileWriter(des);
		
		int len =0;
		while((len=fr.read())!=-1) {  // 읽은거 쓰고, 읽은거 쓰고 더 이상 읽을수 없을경우 -1 반환
				fw.write(len);
		}
		
		fr.close();
		fw.close();
		System.out.println("복사완료");
	}
}
