package com.codegnan.collections;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		
		Set<Integer> set = new LinkedHashSet<>();
		
		String[] arr = line.split(" ");
		for(String s: arr) {
			set.add(Integer.parseInt(s));
		}
		
		int sum=0;
		for(int num : set) {
			sum += num;
		}
		
		System.out.println(sum);
		sc.close();
	}

}
