package p05.lecture;

import java.util.Scanner;

public class A01Reference {
	//자료형 (2가지)
	//1. 기본타입 (원시타입) primitive type
	//	byte,short,int,long,float,double,char,boolean
	
	//2.참조타입 reference type
	// 기본타입 외 모두
	
	//차이점 
	//기본타입은 데이터를 저장
	//참조타입은 데이터를 저장한 객체의 참조를 저장
	
	//예제(기본타입)
	int i; //저장공간 4byte가 생김
	i = 3; // 그 저장공간에 3을 할당
	
	//예제(참조타입)
	Scanner scanner;
	scanner = new Scanner(System.in);
	
	
}
