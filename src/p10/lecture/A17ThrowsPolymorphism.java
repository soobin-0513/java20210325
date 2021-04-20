package p10.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class A17ThrowsPolymorphism {
	public static void main(String[] args) {
		method1();
	}
	
	private static void method1() throws FileNotFoundException, ClassNotFoundException {
		Class.forName("java.lang.String");
		FileInputStream fis = new FileInputStream("");
	}
}
