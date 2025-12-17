package com.codegnan.collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		SortedSet<Integer> set = new TreeSet<>();
		
		if(!line.trim().isEmpty()) {
			String[] arr = line.split(" ");
			for(String s : arr) {
				set.add(Integer.parseInt(s));
			}
		}
		
		int target = sc.nextInt();
		
		boolean found = false;
		Iterator<Integer>it = set.iterator();
		while(it.hasNext()) {
			if(it.next()== target) {
				found = true;
				break;
			}
		}
		
		System.out.println(found);
		sc.close();
	}

}
