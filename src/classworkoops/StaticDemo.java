package classworkoops;

public class StaticDemo {

	public String name = "John";
	public static String section = "A";
	
	public void printstu() {
		System.out.println(name);
		System.out.println(section);
	}
	
	public static void statPrint() {
		System.out.println(section);
		//System.out.println(name); cant cal intsance varaible in static method without its object
	}
	public static void main(String[] args) {
		
		StaticDemo obj = new StaticDemo();
		obj.printstu();
		System.out.println(obj.name);
		System.out.println(section);
		statPrint();
		System.out.println(UsingFinslKeyword.PI_VAL);
	}

}
