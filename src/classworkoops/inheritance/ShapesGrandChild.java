package classworkoops.inheritance;

public class ShapesGrandChild extends ShapeChild {

    int x = 5;
	
	void printx() {
		System.out.println(x);
	}
	public static void main(String[] args) {
		ShapesGrandChild obj = new ShapesGrandChild();
		obj.areaofcircle(8.87f);
		obj.areaOfRectangle();
		obj.areaOfSquare();
		obj.areaOfTriangle();
		obj.printx();
	}

}
