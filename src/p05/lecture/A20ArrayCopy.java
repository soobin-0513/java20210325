package p05.lecture;

import java.util.Arrays;

public class A20ArrayCopy {
	public static void main(String[] args) {
		int[] arr1 = {9,7,5,3,1};
		int[] arr2;
		arr2=arr1;  //배열을 복사한게아니라, 참조값을 복사한거야
		
		System.out.println(arr2[0]); //바꾸기 전
		arr2[0]=10;
		System.out.println(arr2[0]);//바꾼 후
		System.out.println(arr1[0]);
		// 배열을 복사하는 법
		int[] arr3= new int[arr1.length];
		/*
		 arr3[0] = arr1[0]
		 arr3[1] = arr1[1]
		 :
		 arr3[4] = arr1[4]
		 
		 */
		for (int i=0; i<arr1.length;i++) {
			arr3[i]=arr1[i];
		}
		//복사 후
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr3));
		arr3[0]=11;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr3));
		
		
	}
}
