package p06.lecture.p3constructor;

public class Computer {
	String model;
	int memory;
	String cpu;
	int ssd;
	
	//생성자 만듬
	Computer(String model,int memory, String cpu, int ssd){
		this.model=model;
		this.memory = memory;
		this.cpu = cpu;
		this.ssd = ssd;
	}
	
	Computer(String model, int memory, String cpu){
		this.model=model;
		this.memory = memory;
		this.cpu = cpu;
		this.ssd = 128;
	}
	
	Computer(String model, int memory){
		this.model=model;
		this.memory = memory;
		this.cpu="inter";
		this.ssd=128;
	
	}
	/*  위에꺼랑 파라미터가 같음, 컴파일 에러남
	Computer(String cpu,int ssd){
		
	}
	*/
	
	Computer(String model){
		this.model=model;
		this.memory=4;
		this.cpu="4";
		this.ssd=128;
	}
	/* 
	 * 파마미터를 똑같이 만들수 없음  컴파일에러
	Computer(String cpu){
		this.model=model;
		this.memory=4;
		this.cpu="4";
		this.ssd=128;
	}
	*/
}
