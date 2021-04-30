package soobinEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEX {
	public static void main(String[] args) {
		Map<String,Integer> hashmap = new HashMap<>();
		
		hashmap.put("soobin",28);
		hashmap.put("binbin",9);
		hashmap.put("sooyong",15);
		hashmap.put("hyejong",28);
		hashmap.put("sudi",34);
		System.out.println(hashmap.size());
		
		// keySet(), Iterator를 이용한 Map 컬렉션 전체 객체 얻기
		Set<String> keyset =hashmap.keySet();
		Iterator<String> keyInterator= keyset.iterator();
		while(keyInterator.hasNext()) {
			String key =keyInterator.next();
			Integer value =hashmap.get(key);
			System.out.println(key+"의 나이는 "+value+"세 입니다.");
		}
		
		System.out.println("------");
		
		Set<Map.Entry<String,Integer>> entries=hashmap.entrySet();
		for(Map.Entry<String, Integer> entry: entries) {
			
			
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}

}
