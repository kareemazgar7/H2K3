package classworkoops;

public class UsingThrow {

		public void usingThrow() {
		
		
		int [] arr = {55,56,78,79};
		
		for (int i = 0; i < arr.length; i++ ) {
		
			System.out.println(arr[i]);
		}
		int i = 4 ;
		if(i > 3 ) {
			throw new ArrayIndexOutOfBoundsException("index greater than 3 not excepted");
		}
		System.out.println(arr[i]);
		
		}
	
		public static void main(String[] args) {
		UsingThrow obj = new UsingThrow ();
		obj.usingThrow();
	}

}
