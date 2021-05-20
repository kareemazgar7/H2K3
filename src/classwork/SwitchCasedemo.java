package classwork;

public class SwitchCasedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //we can use integer char or string data type for swtch but not float or double or boolean
		
		char mychar='z';
		
		switch(mychar) {
		
		case 'a'  :
		case 'e'  :
		case 'i'   :
		case 'o'  :
		case 'u' :
			System.out.println("its a vowel");
			break;
			
		default  :
			System.out.println("its a consonent");
		
		
		}
		
		
		
		
		
		
		int i = 1;

		switch(i) {
		
		case 1  :
			System.out.println("i am in case 1");
			System.out.println("one");
		    break;
		case 2 :
			System.out.println("i am in case two");
			System.out.println("two");
			break;
		case 3 :
			System.out.println("i am in case three");
			System.out.println("three");
			break;
		case 4 :
			System.out.println("i am in case four");
			System.out.println("four");
			break;
		case 5 :
			System.out.println("i am in case five");
			System.out.println("five");
			break;
		case 6 :
			System.out.println("i am in case six");
			System.out.println("six");
			break;
		case 7 :
			System.out.println("i am in case seven");
			System.out.println("seven");
			break;
		case 8 :
			System.out.println("i am in case eight");
			System.out.println("eight");
			break;
		case 9 :
			System.out.println("i am in case nine");
			System.out.println("nine");
			break;
		case 10 :
			System.out.println("i am in case ten");
			System.out.println("ten");
			break;
		default  :
			System.out.println("invalid value");
			break;
		}
		
		
	}

}
