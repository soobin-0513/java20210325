package p18.textbook.exercises.ex11;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) throws Exception{
		//이 파일을 서버에 전송할ㄲ ㅓ야
		String path ="src/p18/textbook/exercises/ex11/ClientExample.java";
		
		Socket socket = new Socket("211.184.124.209",5001);
		OutputStream os =socket.getOutputStream();
		
		//파일정보를 알고있는 객체만들기
		File file = new File(path);
		//파일객체로 부터 파일 이름 얻어내기
		String fileName = file.getName();
		//100바이트 먼저 보내기? (fileName에서 보내기) 
		byte[] bytes =new byte[100];
		//먼소리인지 모르겠음
		fileName.getBytes(0, fileName.length(), bytes, 0);;
		os.write(bytes,0,100);
		
		System.out.println("[파일 보내기 사작]"+fileName);
		//파일을 읽어서 사용해야되서 파일 읽기 클래스 사용
		FileInputStream fis =new FileInputStream(file);
		//파일 읽어오기
		int len = 0;
		while((len=fis.read(bytes))!=-1) {
			os.write(bytes, 0, len);
		}
		
		os.flush();
		System.out.println("[파일 보내기 완료]");
		
		fis.close();
		os.close();
		socket.close();
	}
}
