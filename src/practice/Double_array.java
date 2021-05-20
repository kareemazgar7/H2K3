package practice;

public class Double_array {

	public static void main(String[] args) {
		
		int [][] number = { {2,3,4,5,6,},
							{2,3,4,5,6,},
							{2,3,4,5,6,},
							{2,3,4,5,6,},
							{46,67,78,78}
		                                };
		System.out.println("---------------for loop----------------------------------");
		
		for(int row = 0; row <number.length;row++ ) {
			for(int col = 0; col < number[row].length;col++ ) {
				System.out.print(number[row][col] +  "\t\t");
			}
			System.out.println();
		}
		System.out.println("------------------for each loop------------------------");
		
		System.out.println(number.length);
		for(int []temp : number) {
			for(int element : temp) {
				System.out.print(element +  "\t\t");
			}System.out.println();
		}
		
	}

}
