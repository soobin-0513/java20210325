package p10.textbook.s100701;

public class Account {
	private long balance;
	
	public Account() {}
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance +=money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException{ //예외 떠넘기기
		if(balance<money) {
			throw new BalanceInsufficientException("잔고부족:"+(money-balance)+"모자람");
		}
		balance-=money;
	}
}
