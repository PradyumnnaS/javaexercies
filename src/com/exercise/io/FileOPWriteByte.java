package com.exercise.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOPWriteByte {
	
	public static void main(String args[]) {
		
		try {
			FileOutputStream fop = new FileOutputStream("/home/PradyumnnaS/EclipseHome/workspace/"
					+ "javaexercies/src/com/exercise/io/fop");
			fop.write(65);
			
			System.out.println("FileDescriptor is:- "+fop.getFD());
			fop.close();
			System.out.println("success");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		}
		
		
	}

}
