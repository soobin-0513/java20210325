package P03.text.exercise;

public class ExersiseP102 {
	public static void main(String[] args) {
		
		//문제 2번
		int x = 10;
		int y =20;
		int z = (++x) + (y--);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		//문제 3번
		int score =85; 
		String result = (!(score>90)) ? "가": "나";
		System.out.println(result);
		
		//문제4번
		int pencils = 534;
		int students = 30;
		//학생 한명이 가지는 연필수
		int pencilsPerStudent =(pencils/students);
		System.out.println(pencilsPerStudent);
		//남은 연필 수
		int pencilsLeft=(pencils % students);
		System.out.println(pencilsLeft);
		
		//문제5번
		int value = 356;
		System.out.println((value/100)*100);
		
		
		//문제6번
		int lengthTop=5;
		int lengthBotton = 10;
		int height =  7;
		double area = ((lengthTop+lengthBotton)*height)/2.0;
		System.out.println(area);
		
		//문재7번
		int x1 = 10;
		int y1 = 5;
		System.out.println((x1>7) && (y1<=5));
		System.out.println((x1%3 == 2) || (y1%2 !=1));
		
		//문제8번
		double x2 = 5.0;
		double y2= 0.0;
		double z2 = x2%y2;  //NaN
		if(Double.isNaN(z2)) {
			System.out.println("0.0으로 나눌수 없습니다");
		}else {
			double result2 = z2+10;
			System.out.println("결과:" +result2);
		}
		
	}
	
}

