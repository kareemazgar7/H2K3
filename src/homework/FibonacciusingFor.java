package homework;

public class FibonacciusingFor {

	public static void main(String[] args) {
		
		int p2= 1;
		int p1= 1;
		
		int cur=0;
		System.out.print(p2 + ","+ p1 + ",");
		
		for (int i = 1; i < 20; i++) {
			cur =p1+ p2;
			
			p2 =p1;
			p1=cur;
			System.out.print(cur + ",");
		}
	}

}
