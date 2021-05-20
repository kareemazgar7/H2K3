package homework;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String friutname = "date";
		
		switch (friutname) {
		
		case "banana"  :	
		case "mango"  :
			 System.out.println("fruite color is yellow");
			break;
	
		case "apple"  :
		case "sberry"  :
		case "cberry"  :
			System.out.println("fruit color is red");
			break;
		
		case "bberry"  :
			System.out.println("fruit color is balck");
			break;
			
		default  :
			
			System.out.println("not a valid fruit name");
				
		
		}
	}

}
