package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection_List {

	public static void main(String[] args) {
		 List<Integer> alist = new ArrayList<Integer>();
		 
		System.out.println( alist.isEmpty());
		 
		 alist.add(70);
		 alist.add(90);
		 alist.add(80);
		 alist.add(60);
		 alist.add(50);
		 alist.add(40);
		 alist.add(30);
		 alist.add(20);
		 
		System.out.println( alist.isEmpty());
		System.out.println(alist.size());
		System.out.println(alist.get(1));
		alist.add(0, 100);
		System.out.println(alist);
		System.out.println(alist.size());
		System.out.println(alist.contains(200));
		System.out.println(alist.contains(500));
		System.out.println(alist.set(0, 600));
		System.out.println(alist);
		
		
		Collections.sort(alist);
		System.out.println(alist);
		Collections.reverse(alist);
		System.out.println(alist);
		Collections.shuffle(alist);
		System.out.println(alist);
		System.out.println(Collections.min(alist));
		System.out.println(Collections.max(alist));
		
		
		for(int temp : alist) {
			System.out.print(temp+" ");
			
		}System.out.println();
		
		for(int i = 0 ; i <alist.size(); i++) {
			System.out.print(alist.get(i) + " ");
		}System.out.println();
		
	}

}
