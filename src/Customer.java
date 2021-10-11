
public class Customer {
	String name;
	int age;
	int balance;
	int noOFTransaction;
	final int MAXTRANSACTION=5;
	final int MINBALANCE=10000;
	@Override
	public String toString() {
		return "\nCustomer [name=" + name + ", age=" + age + ", balance=" + balance + ", noOFTransaction="
				+ noOFTransaction + "]";
	}

	public Customer() {
	}

	public Customer(int age) {
		this.age = age;
	}
	
	public Customer(String name) {
		this.name = name;
	}
	
	public Customer(int age, int balance) {
		this.age = age;
		this.balance = balance;
	}

	public Customer(String name, int age, int balance) {
		this.name = name;
		this.age = age;
		this.balance = balance;
	}
	
	public Customer(String name, int age, int balance, int noOFTransaction) {
		this.name = name;
		this.age = age;
		this.balance = balance;
		this.noOFTransaction = noOFTransaction;
	}

	public int getBalance() {
		return balance;
	}

	void checkMiniumBalance() throws MiniumBalanceException
	{
		if(balance < MINBALANCE)
			throw new MiniumBalanceException("Error: Minium Balance of "+ MINBALANCE +" has to be maintained in account.", balance);
		else
			System.out.println("Avaliable banalce in the account is "+balance);
	}
	void checkMiniumAge() throws MiniumAgeException
	{
		if(age < 22)
			throw new MiniumAgeException("Minium age to avail offers is 21", age);
		else
		{
			System.out.println("Eligible for the offers!!");	
			listAvaliableOffers();
		}
	}
	void listAvaliableOffers() {
		System.out.println("1.Instant Home Loan\n2.Personal Loan"); 
	}
	void checkNoOfTransaction() throws MiniumNoOfTransaction{
		if(noOFTransaction > MAXTRANSACTION)
			throw new MiniumNoOfTransaction("Error: You have reached Maximimum No of Transactions", noOFTransaction);
		else
			System.out.println("Number of Transactions left are "+ (MAXTRANSACTION-noOFTransaction));
	}
}
