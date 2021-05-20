package classworkoopsabstraction;

public class VisaChild extends ParentAbstract{

	@Override
	public String confirmPayment() {
		System.out.println("Checking user details");
		System.out.println(cardno);
		System.out.println(custname);
		return "Payment accepted";
	}
	@Override
	public boolean reduceAmount() {
		System.out.println("deducted amount from user account");
		System.out.println("Amount added to the trade account");
		return true;
	}
	public static void main(String[] args) {
		VisaChild obj = new VisaChild();
		obj.collectCardDetails();
		System.out.println(obj.confirmPayment());
	}

}
