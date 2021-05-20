package classworkoopsabstraction;

public interface PaymentInterface {


	public float PI_VAL = 3.14f; // constant by default
	
	public boolean confirmPayment();  // abstract by default
	
	public boolean reduceAmount();// abstract by default
//	
//	default void defMethod() {// introduced from Java 8
//		System.out.println(" I am in def method ");
//	}
//	
//	static void statMethod() {// introduced from Java 8
//		System.out.println(" I am in def method ");
//	}
}
