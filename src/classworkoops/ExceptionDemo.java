package classworkoops;

public class ExceptionDemo {

	public static void main(String[] args) {
		
	//	String iv = "87897.786";
//		int i = Integer.valueOf(iv);
//		System.out.println(i);
		
		int[] a = { 45, 78, 89, 34};
		
		System.out.println(a[0]);
		System.out.println(a[3]);
//		System.out.println(a[4]);
		System.out.println(a[2]);
		

			try {
				Thread.sleep(3000);
				System.out.println("after sleep");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			int x = 0;
			int y = 10;
			try {
				System.out.println(y/x);
				System.out.println(a[2]);
			} catch(Exception e) {
				System.out.println("Caught exception");
				//e.printStackTrace();
			} finally {
				System.out.println("I am in finally");
			}
//			} catch(ArithmeticException e) {
//				System.out.println("caught div by zero exception");
//			} catch(ArrayIndexOutOfBoundsException e) {
//				System.out.println("caught AIOB exception");
//			}
	
			System.out.println("after / by zero");

		
	}

}
