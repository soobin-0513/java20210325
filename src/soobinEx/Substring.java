package soobinEx;

public class Substring {
	
	public static void main(String[] args) {
		
		String str1 = "0123456789";
		String a =str1.substring(3);
		System.out.println(a);
		
		String str2 = "0123456789";
		String b =str2.substring(3,4);
		System.out.println(b);
		System.out.println("-----------");
		
		String st3 ="abcdefgh";
		System.out.println(st3.indexOf(3)); //해당 인지값이 없으면 -1로 리턴
		System.out.println(st3.indexOf("b")); //해당 인지값 몇번째인지
		System.out.println(st3.lastIndexOf("b")); 
		System.out.println(st3.length());
		
		
	}
	
	public String frontBack(String str) {
		  // str = avaj; -> 첫번째문자열이랑 맨마지막 문자열 교환
		
		  if(str.length()<=1){ //str 배열 길이가1일때나 빈칸일때
		    return str;          // 그대로 출력
		  }else{
		  char last =str.charAt(str.length()-1);  //str배열에 맨마지막 변수선언
		  char first = str.charAt(0);			//str 배열에 첫번째 변수선언
		    return  last+ str.substring(1, str.length()-1) +  first;  
		  }
		}

}
