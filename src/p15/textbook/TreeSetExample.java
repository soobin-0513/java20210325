package p15.textbook;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> scores =new TreeSet<>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
	
		Integer score = null;
		
		score =scores.first();
		System.out.println("가장 낮은 점수:"+score);
		
		score=scores.last();
		System.out.println("가장 높은 점수:"+score);
		
		score =scores.lower(new Integer(95));
		System.out.println("95점 아래 점수:"+score);
		
		score=scores.higher(new Integer(95));
		System.out.println("95점 위의 점수:"+score+"\n");
		
	}
}
