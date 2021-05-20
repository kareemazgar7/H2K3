package practice;

public class abcD {

	public static void method1() {
		int number = 10;
		String name ="ali";
		System.out.println(number);
		System.out.println(name);
	}
	public  void method2() {
		int number = 10;
		String name ="ali";
		System.out.println(number);
		System.out.println(name);
	}

	public static void main(String[] args) {
		abcD obj = new abcD();
		obj.method2();
		
		method1();
	}

}
