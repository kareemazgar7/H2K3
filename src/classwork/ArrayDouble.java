package classwork;

public class ArrayDouble {

	public static void main(String[] args) {
		
		int[][] stu  = new int [4][5]; //4*5
		
		stu[0][0] = 40;
		stu[0][1] = 50;
		stu[0][2] = 30;
		stu[0][3] = 20;
		stu[0][4] = 10;
		
		stu[1][0] = 41;
		stu[1][1] = 51;
		stu[1][2] = 31;
		stu[1][3] = 21;
		stu[1][4] = 11;
		
		stu[2][0] = 42;
		stu[2][1] = 52;
		stu[2][2] = 32;
		stu[2][3] = 22;
		stu[2][4] = 12;
		
		stu[3][0] = 43;
		stu[3][1] = 53;
		stu[3][2] = 33;
		stu[3][3] = 23;
		stu[3][4] = 13;
		
		//in any multi dimentional array length wise it will give you only first number.example [4]
        //so if you have two dimentonal array we will use two for loop
		//any array should be one data type 
		for (int row = 0; row < stu.length; row++) { 
		    for (int col =0; col < stu[row].length; col++) {
		    	System.out.print(stu[row][col]+ "\t\t");
		    }
		    System.out.println();
		}
		System.out.println("----------------------");
		
		String[][] emp= {
				        {"A1", "JOHN", "NY"},
				        {"A2", "ALI", "NJ"},
				        {"A3", "ROBI", "CO"},
				        {"A4", "BAKKAR", "CL"},
				        {"A5", "NOMAN", "FL"}
				        };
		for(String[] temp  : emp) {
			for(String element  : temp) {
				System.out.print(element  +  "\t\t");
			}
			System.out.println();
		}
	}                 

}
