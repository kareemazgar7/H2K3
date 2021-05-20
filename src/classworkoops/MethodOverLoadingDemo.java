package classworkoops;

public class MethodOverLoadingDemo {

	public void sum(int a, int b) {
		int c = a +b;
		System.out.println("Sum (int int): " + c);
	}
	
	public void sum(int a, int b , int c) {
		int r = a +b + c;
		System.out.println("Sum (int int int): " + r);
	}
	
	public void sum(float a, float b , float c) {
		float r = a +b + c;
		System.out.println("Sum : (float float float)" + r);
	}
	
	private float sum(float a, int b , byte c) {
		float r = a +b + c;
		//System.out.println("Sum (float int byte): " + r);
		return r;
	}
	
	public static void main(String[] args) {
		

		MethodOverLoadingDemo obj = new MethodOverLoadingDemo();
		obj.sum(5, 10);
		obj.sum(78.6f,  56.8f, 53.0f);
		obj.sum(15, 50, 40);
		float r = obj.sum(9.78f, (int)50, (byte)10);
		System.out.println("Sum (float int byte): " + r);

	}

}
