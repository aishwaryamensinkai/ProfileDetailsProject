
public class MiniumAgeException extends Exception{
	int age;
	final int MINBALANCE=10000;
	public MiniumAgeException(String message,int age) {
		super(message);
		this.age=age;
	}
}
