package practice;

public class UsingThisKeyword {

	public float radius;
	public int length;
	public int width;
	
	public UsingThisKeyword(float radius,int length ,int width) {
		//this(length,width);
		this.radius =radius;
		this.length= length;
		this.width= width;
		}
	
	public UsingThisKeyword(int length ,int width) {
		this.length= length;
		this.width= width;
		
	}
	public UsingThisKeyword (float radius) {
		this.radius =radius;
	}
	public void printVal() {
		System.out.println(radius);
		System.out.println(length);
		System.out.println(width);
	}
	public static void main(String[] args) {
		
		UsingThisKeyword obj = new UsingThisKeyword(30.5f,50,60);
		obj.printVal();
		System.out.println("-------------------");
		UsingThisKeyword obj1 = new UsingThisKeyword(850,600);
		obj1.printVal();
		System.out.println("-----------------------");
		UsingThisKeyword obj2 = new UsingThisKeyword(30.5f);
		obj2.printVal();
		
				
	}

}
