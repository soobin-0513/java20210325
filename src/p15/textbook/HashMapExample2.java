package p15.textbook;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student,Integer> map =new HashMap<Student,Integer>();
		
		map.put(new Student(1,"홍길동"),95);
		map.put(new Student(1,"홍길동"),95);  //학번과 이림으 동일한  Student를 키로 저장
		
		System.out.println("총 Entry 수:"+map.size());
		
	}
}
