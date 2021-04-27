package p15.lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A03ArrayList {
	public static void main(String[] args) {
		//배열 만드는 법
		int[] arr1 = new int[3];
		arr1[0]=99;
		arr1[1]=100;
		arr1[2]=101;
		//arr1[3]=102; 안됨! 3개이상값이들어갈때는 배열 새로만들어야함
		//새로 배열길이 늘려줘야함
		arr1= Arrays.copyOf(arr1,4);
		System.out.println(Arrays.toString(arr1));
		
		
		// list  
		List<Integer> list =new ArrayList<>();
		list.add(99);
		list.add(100);
		list.add(101);
		list.add(102);
		System.out.println(list);
	}
}
