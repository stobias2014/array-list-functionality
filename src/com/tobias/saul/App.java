package com.tobias.saul;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		
		names.add("John Doe");
		names.add("Jane Doe");
		names.add("Bill Ford");
		names.add("Dale Gribble");
		names.add("Hank Hill");
		names.add("Peggy Hill");
		
		System.out.println("Priniting names....");
		print(names);
		System.out.println();
		
		names.remove(0);
		
		System.out.println("Removed a name....");
		print(names);
		System.out.println();
		
		names.add(4, "Blah Name");
		
		System.out.println("Added name at index...");
		print(names);
		System.out.println();
		
		
		System.out.println("\nContains Hank Hill: " + names.contains("Hank Hill"));
		
		System.out.println("\nIndex 2: " + names.get(2));
		
		System.out.println("\nIndex of Peggy Hill: " + names.indexOf("Peggy Hill"));
		
		System.out.println("\nIs empty: " + names.isEmpty());
		
		System.out.println("\nSize: " + names.size());
		
		System.out.println("\nCleared all....");
		names.clear();
		print(names);
		
	}
	
	public static void print(List<String> names) {
		names.forEach(name -> System.out.println(name));
	}

}
