package p05.textbook.exercise;

public class Exercise07 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1,5,3,8,2};
		
		//최댓값
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				//max의값보다array[i]이 크면 max=array[i];
				max=array[i];
			}
		}
		
		//최소값
		int min=1;
		for(int i=0;i<array.length;i++) {
			if(min>array[i]) {
				min=array[i];
			}
		}
		
		// 합계
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		// 평균
		double avg = sum / (double) array.length;
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		
		
		
	}
}
	