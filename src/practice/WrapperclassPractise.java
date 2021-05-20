package practice;

public class WrapperclassPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String number = "767688";
		Integer number1 = Integer.valueOf(number);
		System.out.println(number1);
		
		String f = "555.666f";
		Float f1 = Float.valueOf(f);
		System.out.println(f1);
		
		String d = "55555.66655d";
		Double d1 = Double.valueOf(d);
		System.out.println(d1);
		
		Double d3 = 555577.77777d;
		String d4 = String.valueOf(d3);
		System.out.println(d4);
	}

}
