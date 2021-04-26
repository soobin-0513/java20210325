package p13.lecture;

public class A07WildCard {
	public static void main(String[] args) {
		//박스7 ParentGeneric7타입에 인스턴드
		Box7<ParentGeneric7> b1 = new Box7<>();
		//박스7 Generic7타입에 인스턴드
		Box7<Generic7> b2 = new Box7<>();
		
		//b1=b1; 할당안됨 상속관계X
		//Box7<ParentGeneric7>,	Box7<Generic7> 상위타입구분안됨,
		//상위타입을 결정하기위해서 extends, super 키워드를 사용
		//ParentGeneric7를 상속받은 어떤놈-> ? 
		//Box7<?extends ParentGeneric7>은 Box7<Generic7> 상위타입
		Box7<?extends ParentGeneric7> b3;
		b3=b2;
		
		Box7<? extends Generic7>b4;
		b4=b2;
		
		//어떤타입을 기준으로, 상위타입만 명시하고싶을때
		Box7<? super Generic7>b5;
		b5=b2;
		b5=b1;
		
		Box7<? super ChildGeneric7>b6;
		b6=b2;
		
		
	}
}

class Box7<T>{
	
}
class ParentGeneric7{
	
}
class Generic7 extends ParentGeneric7 {
	
}
class ChildGeneric7 extends Generic7{
	
}
