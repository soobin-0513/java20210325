package p12.textbook.s120202;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		Thread thread = new BeebThread();
		thread.start();
		
		for(int i =0; i<5;i++) {
			System.out.println("띵");
				
				try {
					Thread.sleep(500);
				}catch(Exception e) {
					
				}
			}
	}
}
