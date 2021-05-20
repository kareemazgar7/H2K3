package practice;

public class StringPractice {
   // string not a data type its a class
	//we can use string variable as a object with help of . operator
	//however we can make all primitiv data type into class.eg.. int to Integer , float to Float etc.
	public static void main(String[] args) {
//		Integer num = 500;
//		System.out.println(500);
//		String name = new String("john");
//		Integer num = new Integer (7);
//		System.out.println(name);
//		System.out.println(num);
		String sval = "  java is the object oriented programming language ! java  ";
		System.out.println("is empty: " +sval.isEmpty());
		System.out.println("lenght :"  +sval.length());
		System.out.println("char :"  +sval.charAt(3));
		System.out.println("contains with oriented:"  +sval.contains("oriented"));
		System.out.println("uppercase :"+ sval.toUpperCase());
		System.out.println("to lower case:"  +sval.toLowerCase());
		String sval1= "ali";
		String sval2= "Ali";
		System.out.println("concant:  "  +sval1.concat(sval2));
		System.out.println("equal:  "  +sval1.equals(sval2));
		System.out.println("equal ignorecase  :"  +sval1.equalsIgnoreCase(sval2));
		System.out.println("trim:  "  +sval.trim());
		System.out.println("substring :"  +sval.substring(7));
		System.out.println("substring begin and ends :"  +sval.substring(7, 14));
		
		//System.out.println(sval.split("oriented"));
		
		String[] sval3 = sval.split("object");
		System.out.println(sval3.length);
		for(String temp  : sval3) {
			System.out.println(temp);
		}
		
		
		String sval4 =sval.replaceFirst("java", "phyton");
		System.out.println("replace first  :"  + sval4   );
		System.out.println("replace :" + sval.replaceAll("java", "phyton"));
		System.out.println(sval.replace('a', 'm'));
	}

}
