package p12.lecture;

public class A08RunnableLambda {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("스레드1실행");
				
			}
			
		});
		t1.start();
	}
}
