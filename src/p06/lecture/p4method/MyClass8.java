package p06.lecture.p4method;

public class MyClass8 {
	
	int max(int... nums) {
		if (nums.length == 0) {
			return 0;
		}
		
		int max = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			if (max < nums[i]) {
				max = nums[i];
			}
		}
		
		return max;
	}
	
	/*int max(int...nums) {
		System.out.println("요것은max메소드입니다");
		int a = Integer.MIN_VALUE; 
		int[] array = {};
		
		for(int j =0;j<array.length;j++) {
			if(a<array[j]) {
				a=array[j];
			}
			System.out.println(a);
		}
		
		return 0;
	}
	*/
}
