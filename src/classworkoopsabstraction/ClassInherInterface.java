package classworkoopsabstraction;

public class ClassInherInterface extends MasterCardChild implements PaypalInterface {

	
	@Override
	public boolean processpaypal() {
		System.out.println("In paypal interface process paypal");
		return true;
	}

    public static void main(String[] args) {
    	ClassInherInterface obj = new ClassInherInterface();
    	obj.processpaypal();
    	obj.confirmPayment();
    	obj.reduceAmount();
	}
}
