package soobinEx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		Set<String>set = new HashSet<>();
		set.add("hi");
		set.add("How are you");
		set.add("I m fine");
		set.add("hi");
		set.add("byebye");
		System.out.println(set.size());
		
		Iterator<String>iterator = set.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		System.out.println("---향상된for문---");
		for(String str : set) {
			System.out.println(str);
		}
		
	}
}
