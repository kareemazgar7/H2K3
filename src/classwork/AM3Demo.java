package classwork;

import classworkoops.Accessmodifierdemo;

public class AM3Demo {

	public static void main(String[] args) {
		
		Accessmodifierdemo obj =new Accessmodifierdemo();
		System.out.println(obj.p);//public
		obj.printP();//public
		//System.out.println(obj.pr);//private
		//obj.printpr();// cant access as it is private
		//obj.name(); package private
		//obj.printnme(); //package private
		

	}

}
