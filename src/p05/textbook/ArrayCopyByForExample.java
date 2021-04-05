package p05.textbook;

import java.util.Arrays;

public class ArrayCopyByForExample {
	public static void main(String[] args) {
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5];
		
		//oldIntArray배열생선 및 복사?
		for(int i=0; i<oldIntArray.length;i++) {
			newIntArray[i]=oldIntArray[i];
		}
		System.out.println(Arrays.toString(newIntArray));
		
		for(int i=0; i<newIntArray.length;i++) {
			System.out.print(newIntArray[i]+",");
		}
		
	}
}
