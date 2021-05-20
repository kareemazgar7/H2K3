package classworkoops.inheritance;

public class OverRideClass extends ShapeParent{
    //OVERRIDE only applicable on instance method
	// static method we cant override. however we can create same static method on parent and child class we call it hiding. 
	@Override
	public void areaofcircle(float r1 ) {
		double a =  Math.PI * r1 * r1;
		System.out.println("area of circle ( child) : " + a);
	}
	
	public static void printp() { // Hiding, its not overriding
		System.out.println("PI : " + Math.PI);
	}
	
	public void sampleMethod() {
		System.out.println("its sample method");
	}
	public static void main(String[] args) {
		OverRideClass obj = new OverRideClass(); 
		obj.areaofcircle(9.76f);
		OverRideClass.printp();
		ShapeParent.printp();
		System.out.println("---------------------");
		ShapeParent obj2 = new OverRideClass(); // Runtime polymorphism --it only can execute parentclass bhaivior
		obj2.areaofcircle(19.75f); //and from child class it only can execute @overide method. (DYNAMIC BINDING)
		obj2.areaOfRectangle();
		obj2.areaOfSquare();
		//obj2.sampleMethod(); //can not access because its instance method of local class.(overrideclass)
	}

}
