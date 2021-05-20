package homework;

public class AvgofsumnumberusingDOWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float res;
		int i =1;
		int sum =0;
		do {
			sum = sum+i;
			i++;
		}while(i <= 50);
		
		System.out.println(i);
		
		res =(float)sum/(i-1);
		System.out.println("sum  :"+sum);
		System.out.println("avarage  :"+res);
		
	}
}
