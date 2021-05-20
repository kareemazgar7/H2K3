package classwork;

public class OperatorsName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =20;
		int b=10;
		//Arethmetic operator
		int res=0;
		res =a+b;
		System.out.println("addition :"+ res);
		res=a-b;
		System.out.println("subtraction: "+res);
		res=a*b;
		System.out.println("multipication :"+res);
		res=a/b;
		System.out.println("division :"+res);
		res=a%3;
		System.out.println("remainder  :"+res);
		
		//RelationalOperator
		boolean rval;
		rval=a >b;
		System.out.println("a>b   :"+rval);
		rval= a<b;
		System.out.println("a<b  :"+rval);
		rval= a>=b;
		System.out.println("a>=b   :"+rval);//a>b or a==b
		rval=a<=b;
		System.out.println("a<=b  :"+rval);
		rval=a==b;
		System.out.println("a==b  :"+rval);
		rval=a!=b;
		System.out.println("a!=b  :"+rval);
		
		//logocal Oerator
		rval = ( a > 5 ) && ( a > 10 );//if the both expressions are true then result should be true else it is false
		System.out.println("( a>5 ) && ( a>10 ):  "+rval);
		rval = ( a > 5 ) && ( a < 10 );
		System.out.println("( a>5 ) && ( a<10 ):  "+rval);
		
		rval = ( a > 5 ) && ( a > 10 ) &&(a <b)||(b< a);
		System.out.println("( a > 5 ) && ( a > 10 ) &&(a <b)||(b< a):  "+rval);
		
		
		rval = ( a > 5 ) || ( a > 10 );//if any of the expressions are true then result should be true else it is false 
		System.out.println("( a>5 ) || ( a>10 ):  "+rval);
		rval = ( a < 5 ) || ( a < 10 );
		System.out.println("( a<5 ) || ( a<10 ):  "+rval);
		
		
		//assingmentOperator
		
		res = a * 5;
		System.out.println("a*5  :"+res);
		a += b;  //a=a+b
		System.out.println("a +=b:  "+a);
		a -=b;  //a=a-b
		System.out.println("a -=b  :"+a);
		a *=b;  //a = a * b
		System.out.println(" a*=b  :"+ a);
		
		a /=b;  //a = a / b		
		System.out.println("a /=b  :"+a);
		a %=3;  //a = a % b		
		System.out.println("a %=b  :"+a);
		
		//Unary operator
		byte i=1;
		System.out.println("i  =" +i);
		System.out.println("++i  :"+ ++i);//increment will be add first then expression will be execute
		System.out.println("i  :"+i);
		System.out.println("i++  :"+ i++); //here first expression will be executed first then increment will be add
		System.out.println("i  :"+ i);
		
		System.out.println("--i  :"+ --i);
		System.out.println("i  =" +i);
		System.out.println("i--  :"+  i--);
		System.out.println("i  =" +i);
		
		boolean bool=false; 
		System.out.println("bool  :"+ bool);
		System.out.println("!bool  :"+  !bool);
		
	}

}
