package p04.lecture;

public class A04IfSample {
	public static void main(String[] args) {
		
		int user = 3;
		int dice =(int)(Math.random()*6)+1 ;  //1~6 임의의 수
		
		//만약 user 와 dice 가 같으면,
		//"당첨되었습니다!" 메세지 출력
		// 그렇지 않으면
		//"다시 실행해보세요" 메세지 출력
		System.out.println(dice);
		if(user == dice) {
			System.out.println("당첨되었습니다.");
		}else {
			System.out.println("다시 실행해보세요.");
		}
	}
}
