package p09.textbook.s090503;

public class Anonymous {
	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 =0;
		int var2 = 0;
		
		field = 10;
		
		//arg1 = 20; final여서 할당못함
		//arg2 = 20;//localClass에서는 field 변수만 사용가능
		
		//var1 = 30; final여서 할당못함
		//var2 = 30;//localClass에서는 field 변수만 사용가능
		
		Calculatable calc = new Calculatable() {
			@Override
			//localClass에서는 field 변수만 사용가능
			public int sum() {
				int result = field + arg1+arg2+var1+var2;
				return result;
			}
		};
		System.out.println(calc.sum());
	}
}
