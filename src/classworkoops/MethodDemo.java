package classworkoops;

public class MethodDemo {

	//in java there is no call by reference
	//there is only pass// or call by value
	public int length = 8;
	public int width = 9;
	public float radius =9.5f;
	
	public void areafcircle() {
		double a = Math.PI * radius *radius;
		System.out.println("areafcircle  :"  +a);
	}
	
	public void areaofsquare(int side) {
		int a = side * side;
		System.out.println("areaofsquare  :"  +a);
	}
	public int areaofrectangle() {
		int a =length *width;
		return a;
	}
	public float areaoftraiangle(float s1, float s2) {
		float a = (s1 + s2)/2;
		return a ;
	}
	
	public static void main(String[] args) {
	
		MethodDemo obj = new MethodDemo();
		obj.areafcircle();
		int s = 21;
		obj.areaofsquare(s);
		
		int ar = obj.areaofrectangle();
		System.out.println("areaofrectangle  :"  +ar);
		
		float at =obj.areaoftraiangle(2.5f, 3.5f);
		System.out.println("areaoftraiangle:"  +at);
		
		

		
		
	}

}
