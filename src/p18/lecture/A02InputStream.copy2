package p18.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class A02InputStream {
	public static void main(String[] args) throws Exception {
		String fileName = "src/p18/lecture/A02InputStream.java";
		InputStream is = new FileInputStream(fileName);
		
		
//		int b1 =is.read(); //지금작성하는파일에 첫번째 바이트를 int 타입으로 읽어냄
//		int b2 = is.read();
//		int b3 = is.read();
//		System.out.println(b1);
//		System.out.println(b2);
//		System.out.println(b3);
//		
		int b = 0;
		int cnt = 0;
		while((b=is.read()) !=-1) {  //더이상읽을꺼 없을때 -1를 리턴한다
			System.out.println(++cnt);
		}
		
		
		
		is.close();
	}
}
