package classwork;

import java.util.Scanner;

public class UsingOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		byte n1= 50;
		byte n2= 40;
		int res=n1+n2;
		System.out.println("res  :"+res);
		
		int a =10;
		int b=5;
		int c=10;
		int r;
		//r =a + b * c; //operator precidence. 
		//r= (a+b) *(c-2);  //here piority is [parentheses()] first 
		
		r= (a + (b*2)) *(c-2); //inner parentheses will execute first then outer parentheses.
		
		System.out.println("r  :"+r);
		
		//(a+b)^2=a^2+2ab+b^2
		a=5;
		b=10;
		double d =0;
		d=Math.pow(a, 2)+( b * b) + (2 * a * b);
		System.out.println("d  "+ d);
		
		//a^ 5 + b^ 6
		d=Math.pow(a, 5)+Math.pow(b, 6);
		System.out.println("d  =" +d);
		
		//PIr^2
	    //PI value = 22/7 =  3.14
		
		//float radius = 9.75f;
		float radius ;
		
		Scanner scan = new Scanner(System.in);

        System.out.println("Enter your radius value");
		
		radius = scan.nextFloat();
		scan.close();
		double area = Math.PI * Math.pow(radius, 2);//( radius * radius)  //area of circle =(PIr^2)
				
		System.out.println("area =  "  +area);		
	}

}
