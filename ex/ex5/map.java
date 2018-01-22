package ex5;

import java.util.*;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> mymap = new HashMap<String,Integer>();

		mymap.put("Vincent",20000);
		mymap.put("Peter",15000);
		mymap.put("Tom",30000);

		System.out.println("Peter's salary is : " + mymap.get("Peter"));
		System.out.println("Contains key Tom ? " + mymap.containsKey("Tom"));
		System.out.println("Contains key Mary ? " + mymap.containsKey("Mary"));
		System.out.println("Contains value 20000 ? " + mymap.containsValue(20000));
		System.out.println();

		for (String key : mymap.keySet()) {
		    System.out.println(key + " -> " + mymap.get(key));
		}
		System.out.println("Entries in map : " + mymap);
		System.out.println();

		System.out.println("Total number of entry : " + mymap.size());
		mymap.remove("Peter");
		System.out.println("After removing, number of entry : " + mymap.size());
	}

}
