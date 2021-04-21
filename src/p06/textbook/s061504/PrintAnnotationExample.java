package p06.textbook.s061504;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		//serivice 클래스로부터 메소드 정보를 얻음
		Method[] declaredMethods =Service.class.getDeclaredMethods();
		
		//Method 객체를 하나씩 처러
		
		for(Method method : declaredMethods) {
			//PrintAnnotation의 적용되는지 확인
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				//PrintAnnotation객체얻기
				PrintAnnotation printAnnotation =method.getAnnotation(PrintAnnotation.class);
				
				
				//메소드 이름 출력
				System.out.println("["+method.getName()+"]");
				//구분선 출력
				for(int i = 0; i<printAnnotation.number();i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				try {
					//메소드 호출
					method.invoke(new Service());
				}catch(Exception e) {
					System.out.println();
				}
			}
		}
	}
}
