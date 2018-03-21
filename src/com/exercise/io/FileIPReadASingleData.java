package com.exercise.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIPReadASingleData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fin = new FileInputStream("/home/PradyumnnaS/EclipseHome/workspace/"
					+ "javaexercies/src/com/exercise/io/fop");
			
			int i = fin.read();
			System.out.println("Value of i before coverting to (char)is:-"+ i);
			System.out.println("Changing the value of i (byte) to (char) :-"+(char)i);
			fin.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
