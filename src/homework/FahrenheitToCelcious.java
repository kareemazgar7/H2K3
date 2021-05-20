package homework;

import java.util.Scanner;

public class FahrenheitToCelcious {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		float fahrenheit ;
		float cel;
		System.out.println("enter tempreture in fahrenheit:  ");
		fahrenheit=scan.nextFloat();
		cel=(fahrenheit-32)*5/9;
		System.out.println("fahrenheit is  :"+ fahrenheit);
		System.out.println("celsicious is  :"+ cel);
		
		scan.close();
		
	}

}
