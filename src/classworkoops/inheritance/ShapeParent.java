package classworkoops.inheritance;

       public class ShapeParent {

	
		
		public float radius = 8.56f;
		int side = 7;
		private final static float PI_VAL = 3.14f;
		protected int length = 9;
		protected int width = 19;
		
		public void areaofcircle(float r ) {
			double a =  PI_VAL * r * r;
			System.out.println("area of circle (parent):  " + a);
		}

		void areaOfSquare() {
			int a = side * side;
			System.out.println("area of square : " + a);
			
		}
		
		private void printPI() {
			System.out.println("PI : " + PI_VAL);
		}
		
		public static void printp() {
			System.out.println("PI : " + PI_VAL);
		}
		
		protected void areaOfRectangle() {
			int a = length * width;
			System.out.println("area of rectangle : " + a);
			
		}
	public static void main(String[] args) {
		
		ShapeParent obj  = new ShapeParent();
		obj.areaofcircle(obj.radius);
		obj.areaOfRectangle();
		obj.areaOfSquare();
		obj.printPI();
	}

}
