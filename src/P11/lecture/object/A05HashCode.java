package P11.lecture.object;

public class A05HashCode {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o1.equals(o2));
		//hashCode값이 다르면 equals가 false여야함
		
		String s1 = new String("java");
		String s2 = new String("java");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		//같은 문자열이면 같은 해시코드가 나옴(다른문자열인데 같은해시코드나올수도있음)
		//해시코드 -- 방번호라고 생각하면됨
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
	}
}
