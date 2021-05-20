package classworkoops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionList {

public static void arrList() {
		//we have to use the wrapper class for class coz it doesnot work with the primitiov data type.
	    //its work with the object.
		List<Integer> aList = new ArrayList<Integer>();
		//ArrayList<Integer> aList = new ArrayList<Integer>();
		System.out.println("Is empty : " + aList.isEmpty());
		System.out.println("Size : " + aList.size());
		aList.add(50);
		aList.add(60);
		aList.add(70);
		aList.add(40);
		aList.add(50);
		aList.add(90);
		aList.add(80);
		aList.add(30);
		System.out.println("Is empty : " + aList.isEmpty());
		System.out.println("Size : " + aList.size());
		System.out.println(aList);
		System.out.println("Value at index 3: " + aList.get(3));
		aList.add(100);
		aList.add(0, 10);
		System.out.println(aList);
		System.out.println("Size : " + aList.size());
		
		System.out.println("Contains 100 : " + aList.contains(100));
		System.out.println("Contains 20 : " + aList.contains(20));
		aList.set(0, 200);
		System.out.println(aList);
		aList.remove(0);
		System.out.println("Size : " + aList.size());
		System.out.println(aList);
		//aList.clear();
		System.out.println(aList);
		
		Collections.sort(aList);
		System.out.println("after sorting : " + aList);
		Collections.reverse(aList);
		System.out.println("after reverse : " + aList);
		Collections.shuffle(aList);
		System.out.println("after shuffle : " + aList);
		System.out.println("Min value : " +Collections.min(aList));
		System.out.println("Max value : " +Collections.max(aList));
		
		List<Integer> aList2 = new ArrayList<Integer>();
		aList2.add(50);
		aList2.add(60);
		aList2.add(70);
		aList2.add(40);
		aList2.add(50);
		aList2.add(90);
		aList2.add(80);
		aList2.add(30);
		System.out.println("al2 : " + aList2);
		
		System.out.println("aList equals aList2 : " + aList.equals(aList2));
		System.out.println("aList2 equals aList2 : " + aList2.equals(aList2));
		System.out.println("Printing array list using for Loop");
		for(int i =0; i< aList.size(); i++) {
			System.out.print(aList.get(i) + " ");
		}
		System.out.println();
		System.out.println("Printing array list using for each");
		for(Integer tval:aList) {
			System.out.print(tval + " ");
		}
		System.out.println();
		System.out.println("Printing array list using itertor");
		Iterator<Integer> it = aList.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		}
		
	public static void main(String[] args) {
		
		arrList();
	}

}
