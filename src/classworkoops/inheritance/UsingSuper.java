package classworkoops.inheritance;

public class UsingSuper extends ShapeParent{

	public float radius ;
	public int side1;
	
	@Override
	public void areaofcircle(float r ) {
		super.areaofcircle(r); // Calling parent method
		System.out.println("after calling parent class method");
	}
	
	public void periCircle() {
		//double p = Math.PI * radius * radius;  
		double p = Math.PI * super.radius * super.radius; //Super refers to immediate  parent
		System.out.println("perimter : " + p);
		
	}
	public static void main(String[] args) {

		UsingSuper obj = new UsingSuper();
		obj.periCircle();
		obj.areaofcircle(9.5f);
	}

}
