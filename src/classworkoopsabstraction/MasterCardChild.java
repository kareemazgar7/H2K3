package classworkoopsabstraction;

public class MasterCardChild implements  PaymentInterface{

	@Override
	public boolean confirmPayment() {
		System.out.println("User payment accepted");
		return true;
	}

	@Override
	public boolean reduceAmount() {
		System.out.println("Amount deducted");
		return true;
	}
	public static void main(String[] args) {
		MasterCardChild obj = new MasterCardChild();
		//obj.PI_VAL = 9.23f; // constant
		System.out.println(obj.PI_VAL);
		System.out.println(obj.confirmPayment());
		System.out.println(obj.reduceAmount());
	}

}
