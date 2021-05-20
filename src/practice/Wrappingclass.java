package practice;

public class Wrappingclass {

	public static void main(String[] args) {
		
		String ival= "99999";
		Integer iv = Integer.valueOf(ival); // string to int 
		System.out.println(iv);
		
		String fval = "555.6666f";
		Float f = Float.valueOf(fval); //string to float 
		System.out.println(f);
		
		int in = 5000;
		String str = String.valueOf(in);//int to string 
		System.out.println(str);
		
		Double dval = 7777777.888888d;  //double to string 
		String d = String.valueOf(dval);
		System.out.println(d);
		
//		String dval1 = Double.toString(dval);
//		System.out.println(dval1);
		 
		
		String dval1 = "999999.55555d";// string to double 
		Double d1 = Double.valueOf(dval1);
		System.out.println(d1);
				
		
	}

}
