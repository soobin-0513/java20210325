package p05.textbook.exercise;

public class ExerciseP182 {
	public static void main(String[] args) {
		//문제 8번
		int[][]array= {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
			};	
		int sum = 0;
		double avg = 0.0;
		int cnt = 0;
		for(int i=0;i<array.length;i++) {
			for(int j=0; j<array[i].length;j++) {
				sum+= array[i][j];
				
				cnt++; //평균 구할려면, 몇번을 탐색했는지 알아야해
			}
		}
		
		/*cnt 대신 length 이용해서 총갯수구하기
		int itemNum =0;
		for(int i =0; i<array.length;i++) {
			itemNum += array[i].length;
		}
		System.out.println(itemNum);
		*/
		
		avg = (double) sum/cnt;
		
		System.out.println("sum:"+sum);
		System.out.println("avg:"+avg);
		

		}
}
