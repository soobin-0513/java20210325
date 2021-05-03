package p18.textbook;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample  {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
													//다른스트림이 감싸는 스트림이 존재한다
		Reader reader = new InputStreamReader(is); //바이트 단위를 문자단위로변경 
		
		int readCharNo;
		char [] cbuf = new char[100]; //문자단위저장할 캐릭터배열
		while((readCharNo=reader.read(cbuf))!=-1) {
			String data = new String(cbuf,0,readCharNo);
			System.out.println(data);
		}
		
		reader.close();
	}
}
