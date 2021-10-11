
public class BankingApp {
	public static void main(String[] args) {
		System.out.println("START");
		Customer p1=new Customer("Aishwarya",25,12000,4);
		Customer p2=new Customer("Apoorva",22,12000,5);
		try {
			System.out.println(p2);
			p2.checkMiniumBalance();
			p2.checkMiniumAge();
			p2.checkNoOfTransaction();
		}
		catch(MiniumBalanceException e) {
			System.out.println(e.getMessage());
			System.out.println(e.differenceAmountToBeAdded());
		}
		catch(MiniumAgeException e) {
			System.out.println(e.getMessage());
		}
		catch(MiniumNoOfTransaction e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(p1);
			p1.checkMiniumBalance();
			p1.checkMiniumAge();
			p1.checkNoOfTransaction();
		}
		catch(MiniumBalanceException e) {
			System.out.println(e.getMessage());
			System.out.println(e.differenceAmountToBeAdded());
		}
		catch(MiniumAgeException e) {
			System.out.println(e.getMessage());
		}
		catch(MiniumNoOfTransaction e) {
			System.out.println(e.getMessage());
		}
		System.out.println("STOP");
	}
}
