package homework;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] alphabet ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	     System.out.println(alphabet.length);
		for(char element  : alphabet) {
			System.out.print(element+  "  ");
		}
		String chars ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] alphabets = chars.toCharArray();
		System.out.println();
	    System.out.println(alphabets.length);
	    
	    for (char element  : alphabets) {
	    	System.out.print(element+ "  ");
	    }
	    //System.out.println();

	}
}
