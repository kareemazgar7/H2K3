package classworkoops;

public class AM2Demo {

	public static void main(String[] args) {
		

		Accessmodifierdemo obj =new Accessmodifierdemo();
		obj.printP();//public 
		obj.printname();//package private
		//obj.printPR(); //private
		System.out.println(obj.p);//public can be access
		System.out.println(obj.name);//no access modifer only can be use within the package
		//System.out.println(obj.pr);//cant access as it is private
	}

}
