package classwork;

public class VariableTypes {

	
	int legs=2; //instance variable
	int eyes =2;
	static String name ="john" ; // class or static variable
	
	 public static void main(String[] args) //in static method you cannot use the non static variable directly
	                                       //we need to crate obj to call them however we can call static varible direcltly 
	                                        //we dont need obj to call them 
	{
		
		int a = 60;// local variable inside the method
		System.out.println(a);
		//System.out.println(name);
		VariableTypes obj=new VariableTypes();
		//System.out.println(obj.legs);
		//System.out.println(obj.eyes);
		obj.sleep();
		
		
	}
	 public void sleep()  //instance method
	 {
		 System.out.println(legs);
		 System.out.println(eyes);
		 System.out.println(name);
	 }
	 
	 public void area (float radius)//  perameter variable 
	                                //also call as local variable
	 {
		 
	 }

}

