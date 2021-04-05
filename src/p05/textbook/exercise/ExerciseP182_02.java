package p05.textbook.exercise;

public class ExerciseP182_02 {
	public static void main(String[] args) {
		//문제 8번
		int[][]array= {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
			};	
		int sum = 0;
		double avg = 0.0;
		int cnt = 0; //총원소가 몇개인지 파악하고싶음
		
		//향상된for문 
		
		for (int[] row : array) {
			for (int n : row) {
				sum += n;
				cnt++;//총원소가 몇개인지 파악하고싶음
			}
		}
		avg = (double) sum/cnt;
		
		System.out.println("sum:"+sum);
		System.out.println("avg:"+avg);
		

		}
}
