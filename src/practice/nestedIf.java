package practice;

import java.util.Scanner;

public class nestedIf {

	public static void main(String[] args) {
		
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("enter age");
		int age = obj.nextInt();
		System.out.println( "my age is...: " + age);
		System.out.println("enter your country");
		String country = obj.next();
		System.out.println("my country is... :" + country);
		
		
		if(age  >18)                // outer If
		 {
			System.out.println("The person is partially eligible to vote");     // outer If block
			
			if (country == "USA")    // inner If 
			{
				System.out.println("The person is fully eligible to vote");     // inner If block
			}
			else                    // inner else
			{
			System.out.println("The person is not Citizen of the Country");	    // inner else block
			}
		    
		}
		else                         // outer else
		{
			System.out.println("The person is not eligible to vote");           // outer else Block
		}
	  }

		
	}


