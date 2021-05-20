package classworkoops;

public class WrapperClassesDemo {

	public static void main(String[] args) {
		
		byte b = 9;
		int i = 4855;
		//i = b;
		b = (byte) i;
		System.out.println(b);
		
		String ival = "97899";
		int iv = Integer.valueOf(ival); // String into int
		System.out.println(iv);
		String fval = "98793.8474f";
		Float f = Float.valueOf(fval); // String to float
		System.out.println(f);
		
		Integer in = 89799;
		String inval = String.valueOf(in); // Int to String
		System.out.println(inval);
		double d = 34344.65666;
		String dval = String.valueOf(d); // double to String 
		System.out.println(dval);
		String dval1 = Double.toString(d);// double to String
		System.out.println(dval1);
		
		int x = 5;
		Integer x1 = 10;
		x1 = x; // Auto boxing ( int -> Integer)
		x = x1; // Un boxing (Integer -> int)
	
	}

}
