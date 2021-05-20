package classworkoops;



import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		hmDemo();
	}

	public static void hmDemo() {
		Map<Integer, String> hm = new HashMap<Integer, String>();
		System.out.println(" Is empty : " + hm.isEmpty());
		System.out.println(" size : " + hm.size());
		
		hm.put(106, "Baker");
		hm.put(101, "John");
		hm.put(102, "Steve");
		hm.put(103, "Lisa");
		hm.put(104, "John");
		hm.put(105, "Linda");

		//hm.put(101, "john");
		System.out.println(" Is empty : " + hm.isEmpty());
		System.out.println(" size : " + hm.size());
		System.out.println("Hashmap : " + hm);
		System.out.println("Contains key : " +hm.containsKey(101));
		System.out.println("Contains Value : " +hm.containsValue("Baker"));
		System.out.println(" Get value based on key : " + hm.get(104));
		Set<Integer> keys = hm.keySet();
		System.out.println("Keys set : " + keys);
		Collection<String> vals = hm.values();
		System.out.println("set values: " + vals);
		System.out.println("Replace by key :" + hm.replace(104, "Michelle"));
		System.out.println("Hashmap : " + hm);
		System.out.println("Replace by key and val :" + hm.replace(104, "Michelle", "Robert"));
		System.out.println("Hashmap : " + hm);
		
		hm.remove(106);
		System.out.println("Hashmap : " + hm);
		hm.remove(103, "Lisa");
		System.out.println("Hashmap : " + hm);
		
	}
}