package com.codegnan.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main22 {

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
		
		int newElement = sc.nextInt();
		set.add(newElement);
		
		int count = 0;
		Iterator<Integer> i = set.iterator();
		while(i.hasNext()) {
			i.next();
			count++;
		}
		
		System.out.println(count);
		sc.close();
	}

}
