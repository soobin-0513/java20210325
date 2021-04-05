package p05.textbook.exercise;

public class ExerciseP181 {
		public static void main(String[] args) {
			System.out.println("--문제6번---");
				//문제 6번
				int[][]array= {{96,86},{83,92,96},{78,83,93,87,88},};
				System.out.println(array.length);
				System.out.println(array[2].length);
				
				System.out.println("--문제7번---");
				//문제 7번 최대값 구하기
				
				int [] arr= {1,5,3,8,2};
				int max =0;
				for (int i = 0; i < arr.length; i++) {
					if (max < arr[i]) {
						max = arr[i];
					}
				}
					System.out.println("max:"+max);
				

			
				
			
			
		}
}
