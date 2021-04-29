package p15.lecture;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A07Set {
	//	Set 순서가 없구, 중복불가
	public static void main(String[] args) {
		Set<Integer>set = new HashSet<>();
		
		set.add(99);
		set.add(88);
		set.add(22);
		System.out.println(set.size());
		
		set.add(99); //중복이허용되지않음
		System.out.println(set.size());
		
		boolean c =set.contains(99);
		System.out.println(c);
		System.out.println(set.contains(33));
		
		set.remove(99);
		System.out.println(set.size());
		
		set.add(99);
		set.add(33);
		set.add(22);
		System.out.println(set.size());
		
//		set내용 호출
		Iterator<Integer> iter = set.iterator();
		//next 메소드는 set 값있는만큼만 사용가능
		//hasNext 로 next 사용가능한지 판단
//		System.out.println(iter.hasNext());
//		Integer  i1 = iter.next();
//		System.out.println(iter.hasNext());
//		Integer  i2 = iter.next();
//		System.out.println(iter.hasNext());
//		Integer  i3 = iter.next();
//		System.out.println(iter.hasNext());
//		Integer  i4 = iter.next();
//		System.out.println(iter.hasNext());
//		Integer  i5 = iter.next();
		
		while(iter.hasNext()) {
			Integer n = iter.next();
			System.out.println(n);
		}
		
		
		
		
		
		
	}
}
