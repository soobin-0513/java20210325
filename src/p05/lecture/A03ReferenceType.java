package p05.lecture;

public class A03ReferenceType {
	public static void main(String[] args) {
		//그림 :02.참조그림.png
		int i =3;
		int j =3;
		String s = new String("java");
		String t = new String("java");
		System.out.println(i==j);
		System.out.println(s==t); //값을 알수가없음
	}
}
