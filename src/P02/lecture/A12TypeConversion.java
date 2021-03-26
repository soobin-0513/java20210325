package P02.lecture;

public class A12TypeConversion {
	
	//실수
	float floatVar1 ;
	
	
	
	
//	자동형변환
	floatVar1 = doubleVar1;
	
	//정수 -> 실수 자동형변환 가능
	int intVar1 = 3;
	float floatVar2 = intVar1; //자동형변환 
	double doubleVar2 = intVar1; //자동형변환
	
	//실수 -> 정수  강제로 형변환해줘야함
	double doubleVar3= 3.14;
	int intVar3 = doubleVar3;
	
	
}
