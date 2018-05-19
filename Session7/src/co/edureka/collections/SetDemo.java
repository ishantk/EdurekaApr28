package co.edureka.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		//HashSet<String> set = new HashSet<String>();
		TreeSet<String> set = new TreeSet<String>();
		
		// Data isn't added on indexes....
		// Data is stored using Hashing 
		set.add("John");
		set.add("Jennie");
		set.add("John");
		set.add("Jim");
		set.add("Jack");
		set.add("John");
		set.add("Fionna");
		set.add("Harry");
		
		System.out.println(set);
		set.remove("Jim");
		if(set.contains("John")){
			System.out.println("John is in the Set");
		}
		System.out.println(set);
		
		System.out.println("===Iterating in Set===");
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			String nm = itr.next();
			System.out.println(nm);
		}

	}

}
