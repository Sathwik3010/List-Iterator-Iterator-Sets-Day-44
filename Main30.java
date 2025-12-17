package com.codegnan.collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		TreeSet<Integer> set = new TreeSet<>();
		
		if(!line.trim().isEmpty()) {
			String[] arr = line.split(" ");
			for(String s: arr) {
				set.add(Integer.parseInt(s));
			}
		}
		
		Iterator<Integer> it = set.iterator();
		int max = Integer.MIN_VALUE;

        while (it.hasNext()) {
            int val = it.next();
            if (val > max) {
                max = val;
            }
        }
		
		System.out.println(max);
		sc.close();
	}

}
