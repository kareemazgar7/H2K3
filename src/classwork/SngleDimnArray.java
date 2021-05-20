package classwork;

public class SngleDimnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array is a container object that holds a fixed number of value of a single type.
		String[] studnames=new String[11];
		
		studnames[0]= "ali";
		studnames[1]= "bakkar";
		studnames[3]= "ali1";
		studnames[4]= "ali2";
		studnames[5]= "ali3";
		studnames[6]= "ali4";
		studnames[7]= "ali5";
		studnames[8]= "ali6";
		studnames[9]= "ali7";
		studnames[10]= "ali8";
		
		for(int i = 0; i < studnames.length; i++) {
			System.out.println(studnames[i]);
		}
		System.out.println("--------------");
		for (String element : studnames) {
			System.out.print(element+  "  ");
		}
		System.out.println();
			
		int[] marks = {20,30,5,6,7,80};
		
		for(int element : marks) {
			System.out.print(element+ "  ");
		}
				
				
	}

}
