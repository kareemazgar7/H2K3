package practice;

public class ConstractorDemo {

	float radius;  
	int length ;
	int width ;
	
	
	
	public  ConstractorDemo(float r, int l, int w) 	//by creating constructor we can pass our own value to the instance variable

	{
		radius = r;
		length = l;
		width = w;
	}
	
//	public Demo() {
//	}
	public ConstractorDemo( int l, int w) {
		length = l;
		width = w;
	}
	
	public ConstractorDemo(  float s, int l,float w) {
		radius = s;
		length = l;
	}
	
	public void rectengle() {
		double d = radius*length*radius;
		System.out.println(d);
	}
	public static void main(String[] args) {
		
		ConstractorDemo obj =  new ConstractorDemo(45.5f, 5, 100);
		obj.rectengle();
		ConstractorDemo obj1 =  new ConstractorDemo(45.5f, 5,50.5f);
		obj1.rectengle();
		
		
	}

}
