package p07.lecture.p6polymorphism.ex1;

public class A01polymorphism {
	public static void main(String[] args) {
		Cat cat1 =new Cat();
		Tiger tiger1 = new Tiger();
		
		cat1.cry();
		tiger1.cry();
		
		KindaCat k1;
		k1 =cat1;
		
		System.out.println(k1==cat1);
		System.out.println(System.identityHashCode(k1));
		System.out.println(System.identityHashCode(cat1));
		
		KindaCat k2;
		k2 =tiger1;
		System.out.println(k2==tiger1);
		System.out.println(System.identityHashCode(k2));
		System.out.println(System.identityHashCode(tiger1));
		
		
		//cat1 =k1;  고양이는길고양이과다 X
		//tiger1=k2;	고양이는 호랑이과다X
		// tiger1 =cat1; 호랑이는 길고앙야과다X
		// cat1 =tiger1;  길고양이는 호랑이과다X
		
		
		KindaCat k3 =new Cat();
		KindaCat k4 =new Tiger();
		
		
	}
}
