package classworkoops;

import classworkoops.inheritance.ParentClass;

public class subchildOut extends ParentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		subchildOut obj = new subchildOut();
		System.out.println("-----protected members------");
		obj.areaofrectengle();
		System.out.println(obj.lenght);
		System.out.println(obj.width);
		
		System.out.println("-----public members------");
		System.out.println(obj.radius);
		obj.areaofcircle(8.77f);
		
		System.out.println("-----no access members------");
	//	System.out.println(obj.side);
		//obj.areaofsquare();
		
		System.out.println("-----private  members------");
		//System.out.println(obj.PI_VAL); //private memeber cant be access as it is private
		//obj.printPI(); 
		
		
	}

}
