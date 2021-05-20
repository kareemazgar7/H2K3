package classworkoops;

public class Constructordemo {

	//if we dont create any constructor by default there is a constructor
	//by creating constructor we can pass our own value to the instance variable
	//we can have constructor overloading as well. In that case date type and number of parameter should be diffrent 
	float radius;	
	int length ;
	int width;
	
	public Constructordemo(float r, int l, int w) 	//by creating constructor we can pass our own value to the instance variable

	{
		radius = r;
		length = l;
		width = w;
	}
	
	public Constructordemo() {
	}
	public Constructordemo( int l, int w) {
		length = l;
		width = w;
	}
	public Constructordemo( float r) {
		radius = r;
	}
	public void areaCircle() {
		double a = Math.PI * radius * radius;
		System.out.println("area of circle : " + a);
	}
	public void areaRectangle() {
		int a =  length * width;
		System.out.println("area of rectangle : " + a);
	}
	public static void main(String[] args) {
		
//		Constructordemo obj = new Constructordemo();
//		System.out.println(obj.radius);
//		System.out.println(obj.length);
//		System.out.println(obj.width);
//		obj.areaCircle();
//		obj.areaRectangle();
//		obj.radius = 10;
//		obj.length = 70;
//		obj.width = 90;
//		System.out.println(obj.radius);
//		System.out.println(obj.length);
//		System.out.println(obj.width);
//		obj.areaCircle();
//		obj.areaRectangle();
		
		Constructordemo obj2 = new Constructordemo(25.57f, 30, 45); 
		System.out.println(obj2.radius);
		System.out.println(obj2.length);
		System.out.println(obj2.width);
		obj2.areaCircle();
		obj2.areaRectangle();
		System.out.println("----------------------");
		Constructordemo obj3 = new Constructordemo(55.57f, 100, 200);
		System.out.println(obj3.radius);
		System.out.println(obj3.length);
		System.out.println(obj3.width);
		obj3.areaCircle();
		obj3.areaRectangle();
		System.out.println("----------------------");
		Constructordemo obj4 = new Constructordemo();
		System.out.println(obj4.radius);
		System.out.println(obj4.length);
		System.out.println(obj4.width);
		obj4.areaCircle();
		obj4.areaRectangle();
		System.out.println("----------------------");
		Constructordemo obj5 = new Constructordemo(89.6f);
		System.out.println(obj5.radius);
		System.out.println(obj5.length);
		System.out.println(obj5.width);
		obj5.areaCircle();
		obj5.areaRectangle();
		System.out.println("----------------------");
		Constructordemo obj6 = new Constructordemo(89, 78);
		System.out.println(obj6.radius);
		System.out.println(obj6.length);
		System.out.println(obj6.width);
		obj6.areaCircle();
		obj6.areaRectangle();
	}

}
