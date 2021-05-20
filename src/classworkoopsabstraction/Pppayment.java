package classworkoopsabstraction;

public class Pppayment implements PaypalInterface ,Maesto{  //multiple interface inheritance

	
	@Override
	public boolean MaestoPayment() {
		System.out.println("in masteoclass confirmpayment");		
		return true;
	}
	
	@Override
	public boolean confirmPayment() {
		System.out.println("in pp  class confirm paymnet");		
		return true;
				
	}

	@Override
	public boolean reduceAmount() {
		System.out.println("in pp class reducepayment");
		return false;
	}

	@Override
	public boolean processpaypal() {
		System.out.println("in pp class process pp");
		return false;
	}
	public static void main(String[] args) {
		Pppayment obj = new Pppayment();
		obj.confirmPayment();
		obj.processpaypal();
		obj.reduceAmount();
		obj.MaestoPayment();
	}

	

}
