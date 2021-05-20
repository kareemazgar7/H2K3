package classworkoops;

public class Dog {

	int tail = 1; // Instance variables
	int legs = 4;
	String breed ;
	int height;
	int length;
	
	public void sleep() {
		System.out.println("zzzzzzzzzzzzzzzzzzzz");
	}
	public void bark() {
		System.out.println("..bow..bow..bow...");
	}
	
	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		d1.breed= "Dman";
		d1.height = 9;
		d1.length=20;
		System.out.println(d1.breed);
		System.out.println(d1.height);
		System.out.println(d1.length);
		d1.bark();
		d1.sleep();
		
		Dog d2 = new Dog();
		d2.breed= "pug";
		d2.height = 20;
		d2.length=50;
		d2.tail = 0;
		System.out.println(d2.breed);
		System.out.println(d2.height);
		System.out.println(d2.length);
		System.out.println(d2.tail);
		d2.bark();
		d2.sleep();

	}

}
