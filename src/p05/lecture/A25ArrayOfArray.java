package p05.lecture;

import java.util.Arrays;

public class A25ArrayOfArray {
	//그림 09.배열의배열.png
	public static void main(String[] args) {
			int[][]arr=new int [2][3];

			for (int[] elem : arr) {
				System.out.println(Arrays.toString(elem));
			}
			System.out.println("----값변경----");
			arr[1][1]=9;
			arr[0][2]=9;
			
			for (int[] elem : arr) {
				System.out.println(Arrays.toString(elem));
			}
			
	}
}
