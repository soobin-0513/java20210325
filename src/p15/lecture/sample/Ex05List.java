package p15.lecture.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex05List {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(4,6,9,10);
		List<Integer> list2 = Arrays.asList(-3,-8,-10,-99,-22);
		List<Integer> list3 = Arrays.asList(8888,9999,222,111);
		List<Integer> list4 = Arrays.asList(3030,233,123);
		
		
		
		//각원소가 리스트
		//List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<List<Integer>> list = new ArrayList<>();
		
		list.add(list1);
		list.add(list2);
		list.add(list3);
		list.add(list4);
		
		int max = max(list);
		System.out.println(max);
		
		int max2= max2(list);
		System.out.println(max2);
		
		List<Integer> flatList =flat(list);
		System.out.println(flatList.size());
		System.out.println(flatList.get(15));
		
		flatList=flat2(list);
		System.out.println(flatList.size());
		System.out.println(flatList.get(15));
		
	}

	private static List<Integer> flat2(List<List<Integer>> list) {
		List<Integer>flat =new ArrayList<>();
		
		for(int i =0; i <list.size();i++) {
			List<Integer> sub =list.get(i);
			
			for(int j =0; j< sub.size();j++) {
				Integer item = sub.get(j);
				flat.add(item);
				//flat.add(sub.get(j)); 위에두줄 한줄로
			}
		}
		return flat;
	}

	private static List<Integer> flat(List<List<Integer>> list) {
		List<Integer> flat = new ArrayList<>();
		
		for(List<Integer> sub : list) {
			for(int item: sub) {
				flat.add(item);
			}
		}
		
		return flat;
	}

	private static int max2(List<List<Integer>> list) {
		int max2 = Integer.MIN_VALUE;
		
		for (List<Integer> sub : list) {
			for (int item : sub) {
				if (item > max2) {
					max2 = item;
				}
			}
		}
		
		return max2;
	}

	private static int max(List<List<Integer>> list) {
		int max = Integer.MIN_VALUE;
		
		for ( int i =0; i<list.size();i++) {
			List<Integer> sublist = list.get(i);
			
			for(int j =0; j<sublist.size();j++) {
				int item = sublist.get(j);
				
				if(item>max) {
					max =item;
				}
			}
		}
		
		return max;
	}
}
