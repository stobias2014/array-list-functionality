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
		
		print(names);
		
		names.remove(0);
		
		print(names);
		
		names.add(4, "Blah Name");
		
		print(names);
		
		System.out.println(names.contains("Hank Hill"));
		
		System.out.println(names.get(2));
		
		System.out.println(names.indexOf("Peggy Hill"));
		
		System.out.println(names.isEmpty());
		
		System.out.println(names.size());
		
		
		
	}
	
	public static void print(List<String> names) {
		names.forEach(name -> System.out.println(name));
	}

}
