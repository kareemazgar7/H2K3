package classworkoops.inheritance;

public class ParentClass {

	public float radius =8.0f;
	int side = 7;
	private final float PI_VAL = 3.14F;
	protected int lenght = 9;
	protected int width =10;
	
	
	public void areaofcircle(float r) {
		double a = PI_VAL *r* r;
		System.out.println("areaofcircle  :"  +a);
	}
	
	void areaofsquare() {
		int a = side *side;
		System.out.println("areaofsquare:  "+ a);
				
	}
	
     private void printpPI() {
    	 System.out.println("pi  :"  +PI_VAL);
     }
     
     protected void areaofrectengle() {
    	 int a = lenght * width;
    	 System.out.println("areaofrectengle  :"   +a);
     }
     
     
	public static void main(String[] args) {
		ParentClass obj = new ParentClass();
		obj.areaofcircle(obj.radius);
		obj.areaofsquare();
		obj.areaofrectengle();
		obj.printpPI();
		
		
	}

}
