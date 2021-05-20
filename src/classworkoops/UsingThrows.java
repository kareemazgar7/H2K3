package classworkoops;

public class UsingThrows {
	
	
	//throws is to create checked exception
	//if we dont handle the exception in method then we have to handle it 
	//in the main method by calling that method.
	//however we have to handle the exception with try and catch blog.

	public void throwsdemo  () throws Exception{
		int [] arr = {55,56,78,79};
		System.out.println(arr[3]);
		
		System.out.println(arr[4]);
		}
		
		
	
	
	public static void main(String[] args) throws Exception {
	
	
		UsingThrows obj = new UsingThrows();
		try {
		obj.throwsdemo();
		}catch(Exception e) {
			System.out.println("i caught exception");
		}
		Thread.sleep(4000);{
			System.out.println("after sleep");
		}
	}

}
