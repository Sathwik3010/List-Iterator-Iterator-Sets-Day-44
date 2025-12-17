package com.codegnan.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		
		if(!line.trim().isEmpty()) {
			String[] arr = line.split(" ");
			for(String s : arr) {
				set.add(Integer.parseInt(s));
			}
		}
		
		Iterator<Integer> it = set.iterator();
		int min = Integer.MAX_VALUE;
		
		while(it.hasNext()) {
			int val = it.next();
			if(val<min) {
				min = val;
			}
		}
		System.out.println(min);
		sc.close();
	}

}
