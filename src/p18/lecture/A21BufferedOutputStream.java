package p18.lecture;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class A21BufferedOutputStream {
	public static void main(String[] args)  throws Exception{
		String path= "src/p18/lecture/output8.txt";
		FileOutputStream os = new FileOutputStream(path);
		BufferedOutputStream bos = new BufferedOutputStream(os);
		long start = System.nanoTime();
		for(int i =0;i<300;i++) {
			bos.write('a');
		}
		long end =System.nanoTime();
		System.out.println(end-start);
		
		bos.close();
//		os.write('a');  //속도가 느림
		os.close();
	}
}
