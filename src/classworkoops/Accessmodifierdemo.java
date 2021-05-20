package classworkoops;

public class Accessmodifierdemo {

//	public
//	private 
//	//<package-private>
//	//protected 
	public int p =78;  //public
	private float pr=78.76f;// private
	String name ="john";// no access or private
	
	public void printP() {
		System.out.println(p);
	}
	private void printPR() {
		System.out.println(pr);
	}
	 void printname() {
		 System.out.println(name);
	 }
	
	public static void main(String[] args) {
		
		Accessmodifierdemo obj =new Accessmodifierdemo();
		obj.printP();
		obj.printPR();
		obj.printname();
		System.out.println(obj.p);
		System.out.println(obj.pr);
		System.out.println(obj.name);

	}

}
