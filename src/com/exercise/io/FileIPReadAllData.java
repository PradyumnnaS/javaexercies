package com.exercise.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIPReadAllData {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try {
			
			FileInputStream fin = new FileInputStream("/home/PradyumnnaS/EclipseHome/workspace/"
					+ "javaexercies/src/com/exercise/io/stringfop.txt");
			
			int i=0;    
            while((i=fin.read())!=-1){    
             System.out.print((char)i);    
            }    
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
