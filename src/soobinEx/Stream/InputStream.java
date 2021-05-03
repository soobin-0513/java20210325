package soobinEx.Stream;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class InputStream {
	public static void main(String[] args) throws Exception {
		
		byte[]data= new byte[] {1,3,5,-1};
		
		ByteArrayInputStream bais = new ByteArrayInputStream(data);
		//1byte를 읽어 그 값을 int로 반환, (1byte = -128~127 또는 0~255)
		//더이상 읽을 수 없는 경우 -1 반환
		System.out.println(bais.read());
		System.out.println(bais.read());
		System.out.println(bais.read());
		System.out.println(bais.read());
		System.out.println(bais.read()); //더이상 읽을 바이트가 없어서 -1출력됨
		
		bais.close();
		
		
		
		
	}
}
