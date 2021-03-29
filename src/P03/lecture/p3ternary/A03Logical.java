package P03.lecture.p3ternary;

public class A03Logical {
	public static void main(String[] args) {
		// and &&, & (논리곱)
		// or ||, |(논리합)
		// xor ^ (배타적 논리합)
		//not ! (단항연산자에서 살펴봄)
		
		//and &&, &
		//연산의 결과 boolean
		//양변이 모두 true 일때만 true, 나머지 모두 false
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);

		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & true);
		System.out.println(false & false);
		
		//short circuit 
		int i = 3;
		System.out.println(true && (i++)>0);
		System.out.println(i);
		
		System.out.println(false && (i++)>0); //앞에 이미 false인것을 확인되어서 뒤에연산을 안함,
		System.out.println(i);                 // 그래서 여기도 4로 출력됨
		
		System.out.println(false & (i++)>0); //& 한개사용법은 앞이false여도 뒤에연산을 계산함,
		System.out.println(i);                 // 그래서 5로 출력됨
		
		
		// or ||, |
		// 양변이 false 일 때만 false
		// 나머지 모두 true
		System.out.println(true || true); //true
		System.out.println(true || false); //true
		System.out.println(false || true); //true
		System.out.println(false || false); //false
		
		System.out.println(true | true); //true
		System.out.println(true | false); //true
		System.out.println(false | true); //true
		System.out.println(false | false); //false
		
		System.out.println(true || (i++) > 0); // true
		System.out.println(i);
		
		System.out.println(false || (i++) > 0); // true
		System.out.println(i);
		
		System.out.println(true | (i++) > 0); // true
		System.out.println(i);
		
		//xor ^ (exclusive or)
		//두항의값이 다를 때문 true
		//두항의 값이 같으면 false
		System.out.println("xor");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		

	}
}