package com.codegnan.collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
        TreeSet<Integer> set = new TreeSet<>();

        if (!line.trim().isEmpty()) {
            String[] arr = line.split(" ");
            for (String s : arr) {
                set.add(Integer.parseInt(s));
            }
        }

        if(set.size()<2) {
        	System.out.println("Not avilable");
        	return;
        }
        
        Iterator <Integer> it = set.iterator();
        int prev = Integer.MIN_VALUE;
        int curr = Integer.MIN_VALUE;

        while(it.hasNext()) {
        	prev = curr;
        	curr = it.next();
        }
        
        System.out.println(prev);
		sc.close();
	}

}
