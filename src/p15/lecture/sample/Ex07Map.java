package p15.lecture.sample;

import java.util.HashMap;
import java.util.Map;

public class Ex07Map {
	public static void main(String[] args) {
		int [] arr1 = {1,1,1,3,3,2,3,2,1,4,5,5};
		
		Map<Integer,Integer> map =count(arr1);
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}

	private static Map<Integer, Integer> count(int[] arr1) {
		
		Map<Integer,Integer> map = new HashMap<>();
		
		
		for(int num : arr1) {
			
			if(map.containsKey(num)) {//만약에 그 키가 있으면 꺼내서 1씩 더하기하기
				int cnt = map.get(num);
				map.put(num, cnt+1);
				//map.put(num, map.get(num) +1); 위두줄이랑 같음
				
			}else { //키가없으면 처음 발견된거니까 1
				map.put(num,1);				
			}
		}
		return map;
	}
}
