package classworkoops.inheritance;

public class SuperChild extends SuperParent{

	public int secCode;
	public int userid;

	SuperChild(String uname, String upwd, int s) {
		super(uname, upwd);
		secCode = s;
	}
	SuperChild(String fname, int s) {
		super(fname);
		secCode = s;
	}
	
	public void printSec() {
		System.out.println(secCode);
	}
	
	
	public static void main(String[] args) {

		SuperChild obj = new SuperChild("admin", "admin", 788);
		obj.login();
		obj.printSec();
		SuperChild obj2 = new SuperChild("john", 988);
		obj2.firstName();
		
	}

}
