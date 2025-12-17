package com.codegnan.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setExample {

	public static void main(String[] args) {
		Set<Employee> hashset = new HashSet<>();
		hashset.add(new Employee(1,"Dev", 30000, "hyd"));
		hashset.add(new Employee(2,"Sathwik", 7000, "blr"));
		hashset.add(new Employee(3,"Ruthwik", 4000, "chn"));
		hashset.add(new Employee(4,"Por", 50000, "dl"));
		
		System.out.println(hashset);
		for(Employee emp: hashset) {
			System.out.println(emp);
		}
		
		Set<Employee> Linkedhashset = new LinkedHashSet<>();
		Linkedhashset.add(new Employee(1,"Dev", 30000, "hyd"));
		Linkedhashset.add(new Employee(2,"Sathwik", 7000, "blr"));
		Linkedhashset.add(new Employee(3,"Ruthwik", 4000, "chn"));
		Linkedhashset.add(new Employee(4,"Por", 50000, "dl"));
		
		System.out.println(Linkedhashset);
		for(Employee emp: Linkedhashset) {
			System.out.println(emp);
		}
		
		Set<String> t = new TreeSet<>();
		t.add("Samantha");
		t.add("alia");
		t.add("sunny");
		t.add("katrina");
		System.out.println(t);
	}

}

