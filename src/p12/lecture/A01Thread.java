package p12.lecture;

public class A01Thread {
	//Thread: 프로그램(프로세스) 내에서 실행되는 흐름의 단위
	
	//Thread 만드는 법:
	//1.Thread 클래스 상속
	//2.Runnable 인터페이스 구현
	
	
	public static void main(String[] args) {
		Thread t1 = new Thread1();
		t1.start();
	
		//컴은 빨라서thread 메소드랑 동시 실행
		System.out.println("메인메소드 실행");
	}
	
}

class Thread1 extends Thread{
	@Override
	public void run() { //우리가 실행해야될메소드,실제호출은  start()메소드로호출
		System.out.println("Thread1 실행");
	}
}
