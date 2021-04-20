package P11.textbook.exercise.ex3;

import java.util.HashMap;

import P11.textbook.exercise.ex3.Student;

public class StudentExample {
	public static void main(String[] args) {
		//Students 키로 총점을 저장하는 HasMap객체 생성
		HashMap<Student,String> hashMap = new HashMap<Student, String>();
		
		//new Student("1")의 점수 95를 저장
		hashMap.put(new Student("1"),"95");
		
		//new Student("1")의 점수를 읽어옴
		String score = hashMap.get(new Student("1"));
		System.out.println("1번학생의 총점:"+score);
	
	}
}
