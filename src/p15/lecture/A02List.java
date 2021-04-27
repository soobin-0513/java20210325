package p15.lecture;

import java.util.ArrayList;
import java.util.List;

public class A02List {
	//List : 순서있고, 중복저장가능)
	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		
		//add : 값추가
		list.add("java");
		list.add("spring");
		list.add("python");
	//	list.add(3); String 타입을 선언해서 int안됨
		
		//size : 크기
		int len = list.size();
		System.out.println(len);
		
		//get : 꺼내기
		String e1 =list.get(0);
		String e2 =list.get(1);
		String e3 =list.get(2);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		//String e4=list.get(3);
		
		//for탐색 (list랑잘맞음)
		System.out.println("---for 탐색---");
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("--향상된for문 탐색--");
		for(String e:list) {
			System.out.println(e);
		}
		
		//remove: 삭제
		list.add("servlet");
		System.out.println("--remove 지우기전 for문 탐색--");
		for(String e:list) {
			System.out.println(e);
		}
		
		list.remove(3);
		System.out.println("--remove 지우기후 for문 탐색--");
		for(String e:list) {
			System.out.println(e);
		}
		list.add("object");
		System.out.println("--값추가 지우기전 탐색--");
		for(String e:list) {
			System.out.println(e);
		}
		list.remove("java");
		System.out.println("--remove 지우기후 탐색--");
		for(String e:list) {
			System.out.println(e);
		}
	}
	
}
