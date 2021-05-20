package classworkoops;

public class StringDemo {

	public static void main(String[] args) {
		
		String name = "John";
		//String name = new String("John");
		System.out.println(name);
		name = "Trum";
		System.out.println(name);
		char[] myname = { 's', 'a', 'n', 't', 'a'};
		System.out.println(myname);
		String newname = new String(myname);
		System.out.println(newname);
		
		// String OPerations
		
		String str = "Java is object Oriented programming language! Java";
		
		System.out.println("empty --> " + str.isEmpty());
		int l = str.length();
		System.out.println("length --> " + l);
		String ucase = str.toUpperCase();
		System.out.println("upper case --> " + ucase);
		System.out.println("lower case --> " + str.toLowerCase());
		System.out.println("original string --> " + str);
		System.out.println(" contains Oriented --> " + str.contains("Oriented"));
		System.out.println(" contains oriented --> " + str.contains("oriented"));
		
		String str1 = "java";
		String str2 = "Java";
		
		System.out.println("Equals --> " + str1.equals(str2));
		System.out.println("Equals ignorecase --> " + str1.equalsIgnoreCase(str2));
		
		System.out.println("join --> " + str1 + str2);
		
		System.out.println("char at index 3 --> " + str.charAt(3));
		
		System.out.println("Substring (6) -> " + str.substring(6));
		System.out.println("Substring (6, 12) -> " + str.substring(6, 12));
		System.out.println("trim-->"+ str.trim());
		
		String[] strArr = str.split("o");
		System.out.println("size --> " + strArr.length);
		System.out.println("Split by space-->");
		for(String temp : strArr) {
			System.out.println(temp);
		}
		
		//replace
		String rstr = str.replaceFirst("Java", "Python"); // replace only first occurrence
		System.out.println("Replace first-->" + rstr);
		rstr = str.replace("Java", "C++"); // To replace all occurrences
		System.out.println("Replace -->" + rstr);
		rstr = str.replaceAll("J..a", "C++"); // To replace all occurrences using regular expression
		System.out.println("Replace All-->" + rstr);
		
	}
	}


