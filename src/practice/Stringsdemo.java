package practice;

public class Stringsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//string operation.
		char[] myname = {'a','l','i'};
		System.out.println (myname);
		String newname = new String(myname);
		System.out.println(newname);
	
		
		String str = " java is the object Oriented programming language  java";
		System.out.println("empty--> " + str.isEmpty());
		int l = str.length();
		System.out.println("length  :"  +l);
		String ucase = str.toUpperCase();
		System.out.println("upper case  :"  +ucase);
		System.out.println("orirginal string  :"  +str);
		String locase = str.toLowerCase();
		System.out.println("lower case  :"  +locase);
		//important rapidly used in project
		System.out.println("contains oriented  :"  +str.contains("Oriented"));//contains text method will give you the boolean result.
//		boolean contains = str.contains("object");
//		System.out.println("contains  : " + contains);
		String str1 = "Java";
		String str2 = "java";
		//important
		System.out.println("Equals  :"  +str1.equals(str2));//comparison method gives you the boolean result .(important)
		//important
 		System.out.println("Equal ignorecase :  "+str1.equalsIgnoreCase(str2));// this method is not case sensative either upper or lower case it will give you the true result
		System.out.println("join:  "+ (str1+str2));
		System.out.println("char at index 3  :" + str.charAt(3));
		System.out.println("substring 6: " +str.substring(6));
		System.out.println("substring (6,12): " +str.substring(6, 12) );
		System.out.println("trim  :"  +str.trim());
		
		//important rapidly used in project
		String[] stArr = str.split(" ");//we can split the text by word or character by putting them inside the brecket 
		System.out.println("split by space");
		for(String temp : stArr) {
			System.out.println(temp);
		}
		//repalce
		String rstr = str.replaceFirst("java", "phyton");//it will replace only the first occurance. "java" word with phyton
		System.out.println("Repalce first:  " +rstr);
		 rstr = str.replace("java", "phyton");
		 System.out.println("raplace:  " +rstr);
		 rstr = str.replaceAll("j*a", "c++");
		 System.out.println("replaceall  :"  +rstr);
		
	}

}
