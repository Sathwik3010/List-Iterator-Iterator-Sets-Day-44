package com.codegnan.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		
		if(!line.trim().isEmpty()) {
			String[] arr = line.split(" ");
			for(String s: arr) {
				set.add(Integer.parseInt(s));
			}
		}
		
		int target = sc.nextInt();
		
		boolean found = false;
		Iterator<Integer> s = set.iterator();
		while(s.hasNext()) {
			if(s.next() == target) {
				found = true;
				break;
			}
		}
		
		System.out.println(found);
		sc.close();
	}

}
