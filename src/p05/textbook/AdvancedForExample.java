package p05.textbook;

public class AdvancedForExample {
	//향상된  for문
	public static void main(String[] args) {
		int [] scores = {95,71,84,93,87};
		
		int sum = 0;
		for(int score : scores) {
			System.out.println(score);
			sum = sum +score;
		}
		System.out.println("점수 총합:" +sum);
		
		 double avg =(double) sum/scores.length;
		 System.out.println("점수 평균="+avg);
	}
}
