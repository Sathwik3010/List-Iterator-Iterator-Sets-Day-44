package com.codegnan.collections;

import java.util.Scanner;
import java.util.TreeSet;

public class Main32 {

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
		
		int sum = 0;
		for(int total: set) {
			sum+=total;
		}
		System.out.println(sum);
		sc.close();
	}

}
