package soobinEx;

import java.util.ArrayList;
import java.util.Collections;



public class ArrayListEX {
	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<>();
		ArrayList<Integer> arrList2 = new ArrayList<>();
		
		//add()메소드 요소 저장
		arrList.add(50);
		arrList.add(80);
		arrList.add(55);
		arrList.add(90);
		arrList2.add(50);
		arrList2.add(80);
		arrList2.add(55);
		arrList2.add(90);

		System.out.println(arrList.contains(98));
		System.out.println(arrList.containsAll(arrList2));
		System.out.println("--------");
		//arrList 정렬 해서 출력
		Collections.sort(arrList);
		System.out.println(arrList);
		System.out.println("----------");
		
		// get()메소드로 요소 출력
		for(int i =0; i<arrList.size();i++) {
			System.out.println(arrList.get(i));
		}
		System.out.println("----------");
		//remove() 메소드로 요소 제거
		arrList.remove(1);
		for(int i =0; i<arrList.size();i++) {
			System.out.println(arrList.get(i));
		}
		
		System.out.println("----------");
		arrList.add(920);
		Collections.sort(arrList);
		System.out.println(arrList);
		




	
 	}
}
