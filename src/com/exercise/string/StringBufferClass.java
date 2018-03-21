package com.exercise.string;

public class StringBufferClass {
	
	public static void main(String args[]) {
	
	  StringBuffer sb = new StringBuffer();
	  sb.append("   Hello Dilu  ");
	  sb.append(5  );
	  sb.insert(1, "Hi,");
	  System.out.println(sb);
	  System.out.println(sb.capacity());
	  
	}

}
