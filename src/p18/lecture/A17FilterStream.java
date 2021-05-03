package p18.lecture;
//한글 추가됨
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class A17FilterStream { //보조스트림 (다른스트림으로부터 읽는 스트림, 다른스트림으로부터 쓰는 스트림)
	public static void main(String[] args) throws Exception {
		//inputstream - > reader
		String file ="src/p18/lecture/A17FilterStream.java";
		InputStream is = getInputStream(file);
		InputStreamReader isr = new InputStreamReader(is);  //InputStream에서 읽는 Stream
		
		int b = 0;
		while((b=isr.read())!=-1) {
			System.out.print((char)b);
		}
		is.close();
	}
	
	public static InputStream getInputStream(String file) throws Exception {
		return new FileInputStream(file);
	}
}
