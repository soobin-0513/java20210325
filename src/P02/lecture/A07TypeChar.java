package P02.lecture;

public class A07TypeChar {
	public static void main(String[] args) {
		
	
	//char : 2byte (8vit) 문자 저장하기위함
	
	//javascript
	//var a = "a";
	//    a = 가;
	
	//java  문자열을 저장할려면 String 타입을 써야함 2개문자열이상 저장할때
	String s1 ="hello";  //큰 따옴표 String literal
	s1 = "자바";
	s1 ="a";
	s1 = "";
	
	//java 문자 작은 따옴표사용
	char charVar;
//	charVar = "a"; // not ok
	charVar = 'a'; // char literal
	charVar = '눈';
	System.out.println(charVar);
	charVar = '\uB208';
	System.out.println(charVar);
	charVar = 45576;
	System.out.println(charVar);
	
//	charVar = ''; // not ok
	charVar = '\u10E6';
	System.out.println(charVar);
	
}
}
