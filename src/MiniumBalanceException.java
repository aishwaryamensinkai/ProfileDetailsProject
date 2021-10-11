
public class MiniumBalanceException extends Exception{
	int balance;
	final int MINBALANCE=10000;
	public MiniumBalanceException(String message,int balance) {
		super(message);
		this.balance=balance;
	}
	public String differenceAmountToBeAdded() {
		return "Difference Amount is "+(MINBALANCE-balance);
	}
	
}
