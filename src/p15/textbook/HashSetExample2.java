package p15.textbook;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동",30));
		set.add(new Member("홍길동",30));  //인스턴스는 다르지만 내부 데이터가 동일함으로 중복저장되지 않기위해 hashCode(), equals()오버라이딩해서함
		
		System.out.println("총 객체수 :"+set.size());
	}
}
