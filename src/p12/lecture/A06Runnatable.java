package p12.lecture;

import java.awt.Toolkit;

public class A06Runnatable {
	public static void main(String[] args) {
		Thread t6 = new Thread(new Thread6());
		t6.start();
	}
}

class Thread6 implements Runnable {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

