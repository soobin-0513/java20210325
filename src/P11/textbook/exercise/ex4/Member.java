package P11.textbook.exercise.ex4;

public class Member {
	private String id;
	private String name;
	
	public Member(String id,String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		String de = id+":"+name;
		return de;
	}
}
