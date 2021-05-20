package classworkoops;

public class UsingThisKeyword {

	public float radius;
	public int length;
	public int width;
	
	public UsingThisKeyword(float radius, int length, int width){
		this(length, width);
		this.radius = radius;
		//this.length = length;
		//this.width = width;
	}
	
	public UsingThisKeyword(int length, int width) {
		this.length = length;
		this.width = width;
	}
	public UsingThisKeyword(float radius) {
		this.radius = radius;
	}
	public void printVals() {
		System.out.println(radius);
		System.out.println(length);
		System.out.println(width);
	}
	public static void main(String[] args) {
		
		UsingThisKeyword obj = new UsingThisKeyword(50.75f, 25, 45);
		obj.printVals();
		System.out.println("-------------");
		UsingThisKeyword obj2 = new UsingThisKeyword(50.75f);
		obj2.printVals();
		System.out.println("-------------");
		UsingThisKeyword obj3 = new UsingThisKeyword(50, 60);
		obj3.printVals();
		System.out.println(StaticDemo.section);
		StaticDemo.statPrint();
	}

}
