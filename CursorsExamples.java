package com.codegnan.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursorsExamples {

	public static void main(String[] args) {

		Vector<Integer> v= new Vector<>();
		for(int i=1; i<=10;i++) {
			v.add(i);
		}
		System.out.println(v);
		
		Enumeration<Integer>e = v.elements();
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement()+" ");
		}
		
		System.out.println("using Iterator");
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0; i<=10;i++) {
			al.add(i);
		}
		System.out.println(al);
		Iterator<Integer>itr = al.iterator();
		while(itr.hasNext()) {
			Integer i=(Integer)itr.next();
			if(i%2==0) {
				System.out.println(i);
			}else {
				itr.remove();
			}
		}
		System.out.println(al);
		
		System.out.println("List Iterator");
		ArrayList<String> l = new ArrayList<>();
		l.add("balakrishna");
		l.add("chiru");
		l.add("venki");
		l.add("krishna");
		l.add("sri");
		System.out.println(l);
		
		System.out.println("Elements in forward direction");
		ListIterator<String> itr1 = l.listIterator();
		while(itr1.hasNext()) {
			System.out.println("next Index: "+itr1.nextIndex());
			String s = itr1.next();
			System.out.println("Element: "+s);	
			if(s.equals("venki")) {
				System.out.println("removing venki");
				itr1.remove();
			}
			if(s.equals("chiru")) {
				System.out.println("replacing chiru with cherry");
				itr1.set("cherry");
			}
			if(s.equals("krishna")) {
				System.out.println("adding mahesh after krishna");
				itr1.add("mahesh");
			}
			System.out.println(s);
		}
		System.out.println();
		System.out.println("Elements in backward direction");
		while(itr1.hasPrevious()) {
			System.out.println("next Index: "+itr1.previousIndex());
			String s = itr1.previous();
			System.out.println("Element: "+s);
			
		}
	}

}
