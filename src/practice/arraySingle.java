package practice;

public class arraySingle {

	public static void main(String[] args) {
		
		String [] studnames = new String [15];
		studnames [0] = "ali";
		studnames [1] = "ali1";
		studnames [2] = "ali3";
		studnames [3] = "ali4";
		studnames [4] = "ali5";
		studnames [5] = "ali6";
		studnames [6] = "ali7";
		studnames [7] = "ali8";
		studnames [8] = "ali9";
		studnames [9] = "ali10";
		studnames [10] = "ali11";
		studnames [11] = "ali12";
		studnames [12] = "ali13";
		studnames [13] = "ali14";
	System.out.println(studnames [13]);
		studnames [13] = "inayat"; // updating value
		
		
		//System.out.println(studnames[13]);
	for(int i = 0 ; i <studnames.length; i++ ) {
		
		System.out.println("\t"  +studnames[i]);
	}
	
	System.out.println("printing by using  for each loop ");
	
	for (String element : studnames) {
		System.out.println(element);
	}
	
	System.out.println("printing by using  for each loop ");
	
	int [] marks = {20,30,40,50,60,70,80,90,100,110,111,122,113};

	for (int elements : marks) {
		System.out.println(elements);
	}
	
	System.out.println("using char ");
	
	String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	char [] aphabets = chars.toCharArray(); //this converting string to char
	
	System.out.println(aphabets.length);
	
	for (char i = 0; i <aphabets.length; i++) {
		System.out.print(aphabets[i]+ " ");
		}
	System.out.println();
	
	System.out.println("---------------------using for each-----------------------");
	for (char alpha : aphabets) {
		System.out.print(alpha + " ");
	}
	
	System.out.println();
	aphabets[5] = '!';
	for (char alpha : aphabets) {
		System.out.print(alpha + " ");
	}
	
   }
	

}
