package homework;

public class DoubleDimntionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] myarray = {{11,12,12,14,15},
				           {21,22,112,134,45},
				           {11,12,12,14,15},
				           {11,12,12,14,15}};
		int sum =0;
		
		for (int i = 0; i < myarray.length; i++) {
			
			for (int j =0; j<myarray[i].length; j++) {
				sum= sum +myarray[i][j];
				System.out.print(myarray[i][j]+ "\t\t");
			
			}System.out.println();
		}
		System.out.println("sum:  "+sum);
		
	}

}
