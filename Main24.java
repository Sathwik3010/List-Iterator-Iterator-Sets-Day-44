package com.codegnan.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new LinkedHashSet<>();

		String line = sc.nextLine();

		if (!line.trim().isEmpty()) {
			String[] arr = line.split(" ");
			for (String s : arr) {
				set.add(Integer.parseInt(s));
			}
		}

		int removeValue = sc.nextInt();

		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			if (it.next() == removeValue) {
				it.remove();
				break;
			}
		}

		Iterator<Integer> printIt = set.iterator();
		StringBuilder sb = new StringBuilder();
		while (printIt.hasNext()) {
			sb.append(printIt.next());
			if (printIt.hasNext()) {
				sb.append(" ");
			}

		}

		System.out.println(sb.toString());
		sc.close();
	}

}
