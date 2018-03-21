package com.exercise.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOPWriteString {

	public static void main(String[] args) {
		
		try {
			
			FileOutputStream fop = new FileOutputStream("/home/PradyumnnaS/EclipseHome/workspace/"
					+ "javaexercies/src/com/exercise/io/stringfop.txt");
			
			String s = "Hello , This String is now adding to a file";
			
			//Converting file to byte array to write in op stream
			byte[] b = s.getBytes();
			
			fop.write(b);
			fop.close();
			
			System.out.println("File writing successful");
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
