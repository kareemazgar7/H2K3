package homework;

import java.util.Scanner;

public class oddEvenUsingif {

	public static void main(String[] args) {
	// Read a number from Keyboard , validate its odd number or even number using if else
		int num =0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter integer number:  ");
		num=scan.nextInt();
		scan.close();
		if(num%2 ==0) {
			System.out.println("even number");
		}else {
			System.out.println("odd number");
		}
	}

}
