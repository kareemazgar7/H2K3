package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist_Collection {

	public static void arrlist() {
		
		List <Integer> alist = new ArrayList<Integer>();
		System.out.println(alist.isEmpty());
		System.out.println("size:"   +alist.size());
		alist.add(50);
		alist.add(60);
		alist.add(70);
		alist.add(80);
		alist.add(90);
		alist.add(50);
		alist.add(10);
		System.out.println("size:"   +alist.size());
		System.out.println(alist);
		System.out.println("value at index: "+  alist.get(3));
		alist.add(100);
		alist.add(0, 10);
		System.out.println(alist);
		System.out.println("size:"   +alist.size());
		System.out.println("contans:"  +alist.contains (100));
		System.out.println("contans:"  +alist.contains (5));
		System.out.println(alist.isEmpty());
		alist.set(0, 19);//updating value
		System.out.println(alist);
		alist.remove(0);
		System.out.println(alist);
		//alist.removeAll(alist);
		
		
		//algoritham
		Collections.sort(alist);
		System.out.println("after sorting:"  +alist);
		Collections.reverse(alist);
		System.out.println("reverse the list: "  +alist);
		Collections.shuffle(alist);
		System.out.println("shuffaling: "  +alist);
		System.out.println("min value: "  +Collections.min(alist));
		System.out.println("max value: "  +Collections.max(alist));
		
		List <Integer> alist2 = new ArrayList<Integer>();
		alist2.add(51);
		alist2.add(60);
		alist2.add(70);
		alist2.add(80);
		alist2.add(90);
		alist2.add(50);
		alist2.add(10);
		System.out.println("al2:  "  +alist2);
		System.out.println("equal:"  + alist.equals(alist2));
		System.out.println("equal:"  + alist2.equals(alist2));
		
		System.out.println("Printing using for loop");
		for(int i = 0 ; i< alist.size(); i++) {
			System.out.print(alist.get(i)+ " ");
		}System.out.println();
		
		System.out.println("printing using for each");
		for(Integer tval :alist) {
			System.out.print(tval+  " ");
		}
	
	}
	
	
	
	public static void main(String[] args) {
		arrlist();
	}

}
