package com.codegnan.collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Read existing elements
        String line = sc.nextLine();
        TreeSet<Integer> set = new TreeSet<>();

        if (!line.trim().isEmpty()) {
            String[] arr = line.split(" ");
            for (String s : arr) {
                set.add(Integer.parseInt(s));
            }
        }

        // Read element to add
        int newElement = sc.nextInt();
        set.add(newElement);

        // Count size using Iterator
        int count = 0;
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            it.next();
            count++;
        }

        // Output result
        System.out.println(count);
	}

}
