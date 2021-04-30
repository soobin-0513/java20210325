package p15.lecture;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A13Properties {
	public static void main(String[] args) throws Exception {
		
		Map<String,String>map1 = new HashMap<>();
						//Scanner파일생성자
		String path="bin/p15/lecture/config1.properties";
		Scanner scanner = new Scanner(new File(path)); //파일정보알고있는객체생성
		
		
		while(scanner.hasNextLine()) {
			//System.out.println(scanner.nextLine());
			String line = scanner.nextLine();
			int e = line.indexOf("=");
			String key = line.substring(0,e);
			String value = line.substring(e+1);
			map1.put(key, value);
		}
		System.out.println(map1.get("id"));
		System.out.println(map1.get("password"));
		
		scanner.close();	
		
		
	}
}
