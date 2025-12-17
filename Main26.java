package com.codegnan.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		Set<Integer> set = new LinkedHashSet<>();
		
		if(!line.trim().isEmpty()) {
			String[] arr = line.split(" ");
			for(String s : arr) {
				set.add(Integer.parseInt(s));
			}
		}
		
		int count = 0;
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			it.next();
			count ++;
		}
		
		System.out.println(count);
		
//		System.out.println(set.size());
		sc.close();
	}

}
