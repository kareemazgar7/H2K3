package homework;

import java.util.Scanner;

public class PrintDayusingIf {

	public static void main(String[] args) {

		// Print number (1 to 10 ) in word using if else if ladder
	
		int  i =4;
        Scanner scan =new Scanner(System.in);
		System.out.println("Enter integer number one to five");		
		i=scan.nextInt();
		scan.close();
		if(i ==1) {
			System.out.println("0ne");
		}else if (i ==2){
			System.out.println("two");
		}else if (i==3) {
			System.out.println("three");
			
		}else if (i==4) {
			System.out.println("four");
		}else if (i==5) {
			System.out.println("five");
		}else {
			System.out.println("invalid value");
		}
	
	}

}
