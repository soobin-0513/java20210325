package p12.lecture;

public class A07RunnableAnonymous {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("스레드 실행");
			}
		});
		
		thread.start();
	}
}
