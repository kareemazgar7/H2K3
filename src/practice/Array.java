package practice;

public class Array {

	public static void main(String[] args) {
		
		int [] [] cars = {{ 2,3,4,5},
		               { 2,3,4,5}};
		
		for(int[] bus  :  cars) {
			for(int elemnt : bus){
				System.out.println(bus+ "\t\t");
		        }
			System.out.println();
	            }

}
}
