package P11.textbook.exercise.ex10;

import java.util.regex.Pattern;

public class PatternMatcherExample {
	public static void main(String[] args) {
		String id ="5Angel1004";
		
		//알바벳시작, 숫자알파벳, 총8~12; "[a-zA-Z][a-zA-Z0-9]{7,11}"
		//String regExp ="[a-zA-Z][a-zA-Z0-9]{7,11}";
		String regExp ="[a-zA-Z][\\d|a-zA-Z]{7,11}";
		
		boolean isMatch =Pattern.matches(regExp, id);
		
		if(isMatch) {
			System.out.println("ID로 사용할수 있습니다.");
		}else {
			System.out.println("ID로 사용할 수 없습니다");
		}
	}
}
