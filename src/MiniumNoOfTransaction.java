
public class MiniumNoOfTransaction extends Exception{
	int noOFTransaction;
	public MiniumNoOfTransaction(String message,int noOFTransaction) {
		super(message);
		this.noOFTransaction=noOFTransaction;
	}
}
