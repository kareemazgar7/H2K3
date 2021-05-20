package classworkoops;

public class UsingFinslKeyword {

	public float radius = 9.7f;
	public final float PIVAL= 3.14F;
	
	public static final  float PI_VAL= 3.14F;
	//final key word we can use in variable,method and class alos
	//when we use final at variable it becomes constant we cant chnage its value 
	//at method we cant override the perticuler method during the inheritance
	//by using final key word we cant inheritnace the particuler class.
	public void area() {
		double a = PIVAL* radius * radius;
		System.out.println("area  :"+ a);
	}
	
	public static void main(String[] args) {
		UsingFinslKeyword obj= new UsingFinslKeyword();
		System.out.println(obj.radius);
		System.out.println(obj.PIVAL);
		obj.radius= 24.76f;
		System.out.println(obj.radius);
		//obj.PIVAL=5.6f; //we cant chnage value if we use final keyword at varaible
		
		
	}

}
