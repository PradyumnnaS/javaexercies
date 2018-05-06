package com.exercise.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylListDataType {

	public static void main(String args[]) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(50);
		list.add(90);
		
		List <String> li =  new ArrayList<String>();
		
		li.add("HI");
		li.add("There");
		li.add("How are you");
		
		//through Iterator
		
		Iterator<Integer> it=list.iterator();
		
		while (it.hasNext()) {
			
			System.out.println("List contains numbers:" + it.next());
		}
		
		//Through for each
		
		for(String s: li) {
			
			System.out.println("List contains Strings:" + s);
		}
	}
}

