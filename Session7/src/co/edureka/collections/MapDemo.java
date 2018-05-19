package co.edureka.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "John");
		map.put(201, "Jennie");
		map.put(456, "Jim");
		map.put(77, "Jack");
		map.put(54, "Joe");
		map.put(null, "Fionna"); // null key is supported
		map.put(123, null); // null value is supported
		
		// keys in a map are always, unique. But Values can be duplicated
		map.put(54, "Bob"); // no key can be duplicated, its the data which will be updated
		
		System.out.println(map);
		
		String nm = map.get(101);		
		System.out.println(nm);
		
		if(map.containsKey(101)){
			System.out.println("101 is in the map");
		}
		
		if(map.containsValue("Fionna")){
			System.out.println("Fionna is in the map");
		}
		
		//map.remove(101);
		//map.clear();
		
		// Iterating in a Map
		// 1. Obtain all the keys and then iterate
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()){
			Integer key = itr.next();
			String value = map.get(key);
			
			System.out.println(key+" - "+value);
		}
		
		System.out.println("==================");
		
		//2. EntrySet
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		
		Iterator<Entry<Integer, String>> itr1 = entrySet.iterator();
		
		while(itr1.hasNext()){
			Entry<Integer, String> entry = itr1.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
			
		}
		
		// Thread-Safe
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(101, "John");
		table.put(201, "Jennie");
		table.put(456, "Jim");
		table.put(77, "Jack");
		table.put(54, "Joe");
		//table.put(null, "Fionna"); // null key is not supported
		//table.put(123, null); // null value not is supported
		System.out.println(table);
		
		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
		HashMap<Integer, ArrayList<Employee>> map1 = new HashMap<Integer, ArrayList<Employee>>();

	}

}
