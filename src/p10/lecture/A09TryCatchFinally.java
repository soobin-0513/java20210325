package p10.lecture;

public class A09TryCatchFinally {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		try{
			System.out.println("try 블럭시작");
			int[] arr1 = {2,4,5};
			System.out.println(arr1[3]);
			System.out.println("try 블럭종료");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("catch 블럭시작");
			System.out.println(e.getMessage());
			System.out.println("catch 블럭종료");
		}finally {
			System.out.println("finally 블럭 항상실행");
		}
		System.out.println("프로그램 종료");
	}
}
