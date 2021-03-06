package p18.textbook.exercises.ex11;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerExample {

	public static void main(String[] args) throws Exception{
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("211.184.124.209", 5001));

		System.out.println("[서버 시작]");

		try {
			Socket socket = serverSocket.accept();
			InputStream is = socket.getInputStream();

			byte[] arr = new byte[1000];
			int readByteCount = -1;

			readByteCount = is.read(arr, 0, 100);

			String fileName = new String(arr, 0, readByteCount);
			fileName = fileName.trim();

			System.out.println("[파일 받기 시작]" + fileName);
			FileOutputStream fos = new FileOutputStream("/Temp/" + fileName);
			int len = 0;
			while ((len = is.read(arr)) != -1) {
				fos.write(arr, 0, len);
			}

			System.out.println("[파일 받기 완료]");

			fos.close();
			is.close();
			socket.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			serverSocket.close();
		}
		System.out.println("[서버 종료]");
	}

}
