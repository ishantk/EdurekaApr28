package co.edureka.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

class Employee{

	int eid;
	String name;
	
	public String toString() {
		return eid+" - "+name;
	}
}

public class ListDemo {

	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList();
		ArrayList<String> list2 = new ArrayList<String>();
		ArrayList<Employee> list3 = new ArrayList<Employee>();
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.eid = 101;
		e1.name = "George";
		
		e2.eid = 201;
		e2.name = "Fionna";
		
		// 1. Adding data in list
		
		//list1.add(0,"John"); 		// 0th index
		list1.add("John"); 		    // 0th index
		list1.add("Jennie");
		list1.add(100); // list1.add(new Integer(100));
		list1.add(2.2);
		list1.add('A');
		list1.add(e1);			    // n-1 index
		
		list2.add("John");
		list2.add("Jennie");
		list2.add("Jim");
		list2.add("John"); // Duplicacy is supported
		list2.add("Jack");
		list2.add("Joe");
		//list2.add(e1);  //err
		//list2.add(100); //err
		
		list3.add(e1);
		list3.add(e2);
		
		// 2. See data in list
		System.out.println(list1+"\n"+list1.size());
		System.out.println(list2+"\n"+list2.size());
		System.out.println(list3+"\n"+list3.size());
		
		// 3. Read data on an index
		String str = list2.get(1);
		Employee e = list3.get(0);
		Object o = list1.get(2);
		
		System.out.println(str);
		System.out.println(e);
		System.out.println(o);
		
		//4. Iterating in the List
		//4.1 For Loop
		System.out.println("======For Loop====");
		for(int i=0;i<list1.size();i++){
			Object o1 = list1.get(i);
			System.out.println(o1);
		}
		System.out.println("--------");
		for(int i=0;i<list2.size();i++){
			String nm = list2.get(i);
			System.out.println(nm);
		}
		System.out.println("--------");
		for(int i=0;i<list3.size();i++){
			Employee emp = list3.get(i);
			System.out.println(emp);
		}
		
		//4.2 Enhanced For Loop
		System.out.println("======Enhaced For Loop====");
		for(Object o1 : list1){
			System.out.println(o1);
		}
		System.out.println("--------");
		for(String nm : list2){
			System.out.println(nm);
		}
		System.out.println("--------");
		for(Employee emp : list3){
			System.out.println(emp);
		}
		
		//4.3 Iterator
		System.out.println("======Iterator====");
		Iterator itr1 = list1.iterator();
		while(itr1.hasNext()){
			Object o1 = itr1.next();
			System.out.println(o1);
			//itr1.remove(); -> remove of iterator will delete from ArrayList
		}
		System.out.println("--------");
		Iterator<String> itr2 = list2.iterator();
		while(itr2.hasNext()){
			String nm = itr2.next();
			System.out.println(nm);
		}
		System.out.println("--------");
		Iterator<Employee> itr3 = list3.iterator();
		while(itr3.hasNext()){
			Employee emp = itr3.next();
			System.out.println(emp);
		}
		
		//4.4 ListIterator
		System.out.println("======ListIterator====");
		ListIterator<String> listItr = list2.listIterator();
		while(listItr.hasNext()){
			String nm = listItr.next();
			System.out.println(nm);
		}

		System.out.println("--------");
		while(listItr.hasPrevious()){
			String nm = listItr.previous();
			System.out.println(nm);
		}
		
		//4.5 Enumeration
		System.out.println("======Enumeration====");
		Enumeration<String> enm = Collections.enumeration(list2);
		while(enm.hasMoreElements()){
			String nm = enm.nextElement();
			System.out.println(nm);
		}
		
		// 5 Explore API's on ArrayList
		if(list2.contains("John")){
			System.out.println("John is in the list");
		}
		System.out.println(list2);
		//list2.remove(0);			// delete operation
		//list2.remove("John");
		list2.set(1, "Jennie JJ");  // update operation
		System.out.println(list2);
		
		int idx = list2.indexOf("Jack");
		System.out.println("idx is: "+idx);
		
		ArrayList<String> list4 = new ArrayList<String>();
		list4.add("Mike");
		list4.add("Leo");
		list4.add("Harry");
		
		list2.addAll(list4);
		System.out.println("list2 is: "+list2);
		list2.add(1, "Fionna");
		System.out.println("list2 is: "+list2);
		
		list2.clear(); // removes all objects in the list
		System.out.println("list2 is: "+list2);

		// Thread-Safe
		Vector<String> vector = new Vector<String>();
		vector.add("John");
		vector.add("Jennie");
		vector.add("Jim");
		vector.add("Jack");
		vector.add("Joe");
		
		System.out.println(vector);
		System.out.println(vector.get(2));
		
		//RTP
		List list = new ArrayList();
		list = new Vector();
		list = new LinkedList();
		list = new Stack();
				
	}

}
