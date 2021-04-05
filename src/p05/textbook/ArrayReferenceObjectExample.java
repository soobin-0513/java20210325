package p05.textbook;

public class ArrayReferenceObjectExample {
	public static void main(String[] args) {
		//객체를 참조하는 배열
		
		String[]strArry = new String[3];
		strArry[0] ="Java";
		strArry[1] ="Java";
		strArry[2] =new String["Java"];
	}
}
