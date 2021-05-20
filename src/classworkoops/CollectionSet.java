package classworkoops;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSet {

public static void sDemo() throws Exception {
		
		Set<String> hs = new HashSet<String>();
		
		System.out.println(" Is empty : " + hs.isEmpty());
		System.out.println(" Size : " + hs.size());
		
		hs.add("Java");
		hs.add("is");
		hs.add("object");
		hs.add("oriented");
		hs.add("programming");
		hs.add("language");
		hs.add("Java");
		
		System.out.println(" Is empty : " + hs.isEmpty());
		System.out.println(" Size : " + hs.size());
		System.out.println(" Set values : " + hs);
		
		System.out.println(" contains : " + hs.contains("programming"));
		System.out.println(" hashcode : " + hs.hashCode());
		System.out.println(" hashcode : " + hs.remove("language"));
		printUsingIterator(hs);
		System.out.println();
		System.out.println(" Min : " + Collections.min(hs));
		System.out.println(" Max : " + Collections.max(hs));
		
		System.out.println("Equals : "+ hs.equals(hs));
	}
	
	public static void printUsingIterator(Set<String> hset) throws Exception {
		Iterator<String> it = hset.iterator();
		System.out.print("Printing Set elemnts Using Itertor -->");
		while(it.hasNext()){  
			System.out.print(it.next() + " ");  
		}
	}


	public static void main(String[] args) throws Exception {
		sDemo();
	}

}
