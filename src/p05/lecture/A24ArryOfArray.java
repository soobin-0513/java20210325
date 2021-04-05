package p05.lecture;

import java.util.Arrays;

public class A24ArryOfArray {
	public static void main(String[] args) {
		
		
		int [] arr1 =new int[3];
		
		//다차원배열
		// 행렬 2행3열  int _ _ _
		//			    int _ _ _
		
		int [] [] arr2 = new int[2][3];
		System.out.println(arr2.length);
		System.out.println(arr2[0].length);
		System.out.println(arr2[1].length);
		
		for(int i =0; i<arr2.length;i++) {
			for(int j =0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+",");
			}
			System.out.println();
		}
		
		System.out.println("----값변경-----");
		arr2[1][1]=9;
		arr2[0][2]=8;
		for(int i =0; i<arr2.length;i++) {
			for(int j =0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+",");
			}
			System.out.println();
		}
	
		System.out.println("---향상된 for문, Arrays.toString() 사용----");
		 for(int [] arr: arr2) {
			 System.out.println(Arrays.toString(arr));
		 }
	}
}
