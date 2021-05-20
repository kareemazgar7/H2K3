package classwork;

public class ifStatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		simpleif();
		ifelsestmnt();
		ifelseifladder();
		ifnested();
	}
   
	public static void simpleif() 
   {
	 int a = 10;
	
	 if (a > 9) {
		 System.out.println("its a simple if");
		 System.out.println("its a positive number ");
	 }
	   System.out.println("after if "); //if condition is true then all three statment will be printed because there is no else
   }
	public static void ifelsestmnt() {
		int a =10;
		if (a > 0) 
		{
			System.out.println("i am a if statment");
		}else
			 {
				System.out.println("iam  a else staemnt");
			}
		
		}
	public static void ifelseifladder() {
		int a = 10;
		
		if (a > 11) {
			System.out.println("positive value");
		} else if(a==0) {
			System.out.println("zero value");
		}else {
			System.out.println("negetive value");
		}
        }
	
	public static void  ifnested() {
		int a =0;
		if(a > 0) {
		System.out.println("positive number");
		if (a > 50) {
			System.out.println(" > 50");
		}else {
			System.out.println(" <50");
		}
		}else {
			if(a==0) {
				System.out.println("zero");
			}else {
				System.out.println("negetive");
		}
		}
				
	}
	}


