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
		System.out.println("max:"+max);
		
		//최소값
		int mix=1;
		for(int i=0;i<array.length;i++) {
			if(mix>array[i]) {
				//max의값보다array[i]이 크면 max=array[i];
				mix=array[i];
			}
		}
		System.out.println("mix:"+mix);
	}
}
	