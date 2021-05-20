package practice;

public class String_DemoPract {

	public static void main(String[] args) {
		
		String txt = " Java is the Programming Language 123 ";
		//String txt = new String ("Java is the Programming Language");
		System.out.println(txt);
		System.out.println("lenght : "  +txt.length());
		System.out.println("is empty: "  + txt.isEmpty());
	
		String ucase = txt.toUpperCase();
		System.out.println("upper case :"  + ucase);
		
		String lcase = txt.toLowerCase();
		System.out.println("lowercase :"  +lcase);
		
		System.out.println(txt.contains("is"));
		System.out.println(txt.contains("P"));
		
		String txt1 = " Java";
		String txt2 = " java";
		System.out.println(txt1.equals(txt2));
		System.out.println(txt1.equalsIgnoreCase(txt2));
		System.out.println(txt1 + txt2);
		
		
		
		

	}

}
