package p05.lecture;

import java.util.Arrays;

public class A22ArrayCopyRefType {
	//그림08.참조타입배열복사.png
	public static void main(String[] args) {
		String[]s= {"java","abd"};
		String[]t= new String[2];
//		복사전
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.toString(t));
//		복사후
		System.arraycopy(s,0,t,0,s.length);
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.toString(t));
	}
}
