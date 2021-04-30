package p15.lecture;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class A12MapValues {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		
		map.put("spring",05);
		map.put("sumer",13);
		map.put("fall",45);
		map.put("winter",28);
		
		
		Collection<Integer> values = map.values();
		for(Integer v : values) {
			System.out.println(v);
		}
	}
}
