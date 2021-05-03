package p18.lecture;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class A19BufferedStream {
	public static void main(String[] args) throws Exception {
		String file = "src/p18/lecture/A19BufferedStream.java";
		FileInputStream fis = new FileInputStream(file);
		
		int b =0;
		long start = System.nanoTime();
		while((b=fis.read())!=-1) {
			
		}
		
		long end =System.nanoTime();
		System.out.println(end -start);
		
		FileInputStream fis1 = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis1);  
		
		start =System.nanoTime();
		System.out.println(end-start);
		bis.close();
		fis.close();
	}
}
