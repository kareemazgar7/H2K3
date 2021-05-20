package practice;

public class Wrapper__Class {

	public static void main(String[] args) {

		//java is not 100% object orinted programming language its 99.9%
		//prmitive... data type came from the c language.
//		String name = "2344555";  // string to integer
//		int  number = Integer.valueOf(name);
//		System.out.println(number);
//		
		
//		String sval = "2344.55f"; // string to float
//		float f = Float.valueOf(sval);
//		System.out.println(f);
//		
//		String sval1 = "2344.55666d"; //string to double
//		double d = Double.valueOf(sval1);
//		System.out.println(d);
//		
//		Integer  number1 = 89999999; // integer to string
//		String sval2 = String.valueOf(number1);
//		System.out.println(sval2);
//		
//		int x = 6;
//		Integer x1 = 45555;
//		x1= x; // autoboxing
//		x= x1; // unboxing
		
		Integer n = new Integer(60);
		int n1 = n.valueOf(n);
		System.out.println(n1);
		
		int x = 60;
		Integer x1= x;
		System.out.println(x1);
	}

}
