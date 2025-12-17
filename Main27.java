package com.codegnan.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		Set<Integer> set = new LinkedHashSet<>();
		
		 if (!line.trim().isEmpty()) {
	            String[] arr = line.split(" ");
	            for (String s : arr) {
	                set.add(Integer.parseInt(s));
	            }
	        }
		 
		 Iterator<Integer> it = set.iterator();
		 if(it.hasNext()) {
			 int firstElement = it.next();
			 it.remove();
			 System.out.println(firstElement);
		 }
		sc.close();
	}

}
