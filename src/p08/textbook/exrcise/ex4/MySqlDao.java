package p08.textbook.exrcise.ex4;

public class MySqlDao implements DateAccessObject {
	@Override
	public void select() {
		System.out.println("MySqlDao에서 DB 검색");
	}
	@Override
	public void insert() {
		System.out.println("MySqlDao에서 DB 산입");
	}
	@Override
	public void update() {
		System.out.println("MySqlDao에서 DB 수정");
		
	}
	@Override
	public void delete() {
		System.out.println("MySqlDao에서 DB 삭제");		
	}
	
	
}
