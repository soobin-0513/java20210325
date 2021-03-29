package P11.lecture.string;

public class A01SubString {
	public static void main(String[] args) {
		String str1 = "java servlet spring";
		//원하는 문자열만 출력하고싶을때 
		String st1 =str1.substring(0, 4); 
		System.out.println(st1);
		
		String st2 = str1.substring(5, 12); 
		System.out.println(st2);
		
		String st3 = str1.substring(13, 19); 
		System.out.println(st3);
		
	}
	
}
