package classworkoops.inheritance;

public class SuperParent {

	public String username;
	public String userPwd;
	public String firstName;
	
	SuperParent(String uname, String upwd){
		username = uname;
		userPwd = upwd;
	}
	SuperParent(String fname){
		firstName = fname;
	}
	public void firstName() {
		System.out.println(firstName);
	}
	
	public void login() {
		System.out.println(" Entering username : "+ username);
		System.out.println(" Entering userpassword : "+ userPwd);
	}
	public static void main(String[] args) {

		SuperParent obj = new SuperParent("guest", "guest");
		obj.login();
		SuperParent obj2 = new SuperParent("Ali");
		obj2.firstName();
	}

}
