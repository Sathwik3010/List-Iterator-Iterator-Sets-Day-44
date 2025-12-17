package com.codegnan.collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		TreeSet<Integer> set = new TreeSet<>();
		
		if(!s.trim().isEmpty()) {
			String arr[] = s.split(" ");
			for(String s1 : arr) {
				set.add(Integer.parseInt(s1));
			}
		}
		
		set.clear();
		
		int count = 0;
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			it.next();
			count++;
		}
		
		System.out.println(count);
		sc.close();
	}

}
