package classworkoops.inheritance;

public class ShapeChild extends ShapeParent{


	public int side1 = 8;
	public int side2 = 12;
	
	public void areaOfTriangle() {
		int a = (side1 + side2)/2;
		System.out.println("Are aof triangle : " + a);
	}
	public static void main(String[] args) {
		ShapeChild obj = new ShapeChild();
		System.out.println(" --- protected members----------");
		System.out.println(obj.length); // Protected members
		System.out.println(obj.width);
		obj.areaOfRectangle();
		System.out.println(" --- Public members----------");
		System.out.println(obj.radius);
		obj.areaofcircle(9.765f);
		System.out.println(" --- Package private members----------");
		System.out.println(obj.side);
		obj.areaOfSquare();
		System.out.println(" --- Package private members----------");
		//System.out.println(obj.PI_VAL); // private members can not be accessed
		//obj.printPI();
		System.out.println(" --- Local members----------");
		obj.areaOfTriangle();
	}

}
