package p18.textbook;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputStreamExample {
	public static void main(String[] args) throws Exception {
		String path = "src/p18/textbook/primitive.dat";
		FileOutputStream fos = new FileOutputStream(path);
		DataOutputStream dos = new DataOutputStream(fos);
		
		
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.writeUTF("김자바");
		dos.writeDouble(93.5);
		dos.writeInt(2);
		
		dos.flush();
		fos.close();
		dos.close();
		
		
		FileInputStream fis = new FileInputStream(path);
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i =0; i<2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name+":"+score+":"+order);
		}
		
		fis.close();
		dis.close();
	}
}
