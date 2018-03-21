package com.exercise.string;

public class StringBuilderClass {

	public static void main(String args[]) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Hello ,this is a string builder class.");
		sb.append(" Appending string in it as it is mutable");
		
		System.out.println("Capacity of StingBuilder is :"+sb.capacity());
		System.out.println("Capacity of StingBuilder is :"+sb.insert(5, ","));
		System.out.println("Length of StringBuilder reference : " + sb.length());
		System.out.println(sb);
	}
}
