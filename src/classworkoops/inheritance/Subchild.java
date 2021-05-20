package classworkoops.inheritance;

public class Subchild extends ParentClass{

	public int side1=8;
	public int side2 = 9;
	
	public void areaoftrinagle() {
		int a = (side1+side2)/2;
		System.out.println("areaoftrinagle:  "+a);
	}
	
	
	public static void main(String[] args) {
		Subchild obj =new Subchild();
		System.out.println("-----protected members------");
		obj.areaofrectengle();
		System.out.println(obj.lenght);
		System.out.println(obj.width);
		
		System.out.println("-----public members------");
		System.out.println(obj.radius);
		obj.areaofcircle(8.77f);
		
		System.out.println("-----no access members------");
		System.out.println(obj.side);
		obj.areaofsquare();
		
		System.out.println("-----private  members------");
		//System.out.println(obj.PI_VAL); //private memeber cant be access as it is private
		//obj.printPI(); 
		System.out.println("-----local  members------");
		obj.areaoftrinagle();
	}

}
