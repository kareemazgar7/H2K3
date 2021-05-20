package homework;

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount;
		int principle=100000;
		float rate= 0.1f;
		int t =10;
		
		
		
		amount=principle*Math.pow(1 + rate/100, t);
		System.out.println("amount: "  + amount);
		

        
	    }
}
