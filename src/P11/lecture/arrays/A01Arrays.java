package P11.lecture.arrays;

import java.util.Arrays;

public class A01Arrays {
	public static void main(String[] args) {
		int []arr1 = {7,5,2,2,3,5};
		System.out.println(Arrays.toString(arr1));
		
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
	}
}
