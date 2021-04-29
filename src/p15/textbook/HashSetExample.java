package p15.textbook;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servle/JSP");
		set.add("Java");  //한번만저장됨
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수:"+size);
		
		Iterator<String> iterator = set.iterator();  //반복자 얻기
		while(iterator.hasNext()) {				//객체수 만큼 루핑
			String element = iterator.next();  //한개의 객체수 가져온다
			System.out.println("\t"+element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수:"+ set.size());
		
		iterator = set.iterator();  //반복자 얻기
		while(iterator.hasNext()) {				//객체수 만큼 루핑
			String element = iterator.next();  //한개의 객체수 가져온다
			System.out.println("\t"+element);
		}
		
		set.clear(); //모든객체 제저하고 비우기
		if(set.isEmpty()) {
			System.out.println("비어있음");
		}
	}
}
