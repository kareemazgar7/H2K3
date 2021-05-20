package classworkoopsabstraction;

public abstract class ParentAbstract {

	String cardno;
	String custname;
	
	public final void getCardDetails() {  // Final method cant override in child
		System.out.println("user card deatils");
	}
	
	public abstract String confirmPayment();
	
	public abstract boolean reduceAmount();
	
	public void collectCardDetails() {
		cardno = "345353 345345345";
		custname  = " John Micheal";
	}

}


