package p15.textbook.exercises.ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map =new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("whilte", 92);
		
		String name = null; //최고점수를 받은 아니디 저장
		int maxScore = 0; //최고 점수 저장
		int totalScore=0; //점수합계 저장
		
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			String key= entry.getKey();
			int value = entry.getValue();
			
			if(value>maxScore) {
				name=key;
				maxScore=value;
			}
			totalScore+=value;
		}
		
		
//		key를 탐색해서 꺼내기
//		Set<String> keys = map.keySet();
//		
//		for (String key : keys) {
//			int value = map.get(key);
//			
//			if (value > maxScore) {
//				maxScore = value;
//				name = key;
//			}
//			
//			totalScore += value;
//		}
//		
		
		System.out.println("평균점수:"+((double)totalScore/ map.size()));
		System.out.println("최고점수:"+maxScore);
		System.out.println("최고점수 받은 아이디:"+name);
		
	}
}
