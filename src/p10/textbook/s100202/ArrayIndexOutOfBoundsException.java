package p10.textbook.s100202;

public class ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		
		System.out.println("args의 길이:"+args.length);
		if(args.length >= 2) {
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("args[0]:"+data1);
			System.out.println("args[1]:"+data2);
		}else {
			System.out.println("[실행방법]");
			System.out.println("java ArrayIndexOutOfBoudsException");
			System.out.println("값1 값2");
		}
		
	}
}
