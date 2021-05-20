package practice;

public class Constructor {

	float radius;
	int width;
	int lenght;
	
	public Constructor(float r, int w, int l) {
		radius =r;
		width= w;
		lenght= l;
	}
	

	public Constructor() {
		
	}
	public Constructor(int w, int l ) {
		
		width= w;
		lenght= l;
	}
	public void area() {
		double d = Math.PI *radius *radius ;
			System.out.println("area  "  +d);	
	}
	public void arearectnalge() {
		int a = width* lenght;
		System.out.println("arearectnalge  "  +a );
	}
	
	public static void main(String[] args) {
		
		Constructor obj =new Constructor(10.5f,10, 5);
		System.out.println(obj.lenght);
		System.out.println(obj.radius);
		System.out.println(obj.width);
		obj.area();
		obj.arearectnalge();
		System.out.println("-------------");
		Constructor obj1 =new Constructor();
		System.out.println(obj1.lenght);
		System.out.println(obj1.radius);
		System.out.println(obj1.width);
		obj1.area();
		obj1.arearectnalge();
		System.out.println("-------------");
		Constructor obj2 =new Constructor(200 , 300);
		System.out.println(obj2.lenght);
		System.out.println(obj2.radius);
		System.out.println(obj2.width);
		obj2.area();
		obj2.arearectnalge();

	}

}
