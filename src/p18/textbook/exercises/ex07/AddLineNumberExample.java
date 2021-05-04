package p18.textbook.exercises.ex07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		String path= "src/p18/textbook/exercises/ex07/AddLineNumberExample.java";
		
		Reader rd =new FileReader(path);
		BufferedReader br = new BufferedReader(rd);
		
		String line = null;
		int Num = 1;
		while((line=br.readLine())!=null) {
			System.out.print(Num+++":");
			System.out.println(line);
		}
		br.close();
		rd.close();
	}
}
