package com.exercise.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStudent{
	
	public static void main(String args[]) {
		
		//Creating a ArrayList and adding Student Object info in it.
		
		List<Student> li = new ArrayList<Student>();
		
		Student s1 = new Student(1,"Dilu",25);
		Student s2 = new Student(2,"Sonu",19);
		Student s3 = new Student(3,"Pradyumnna",26);
		Student s4 = new Student(4,"Akankshya",20);

	
		li.add(s1);
		li.add(s2);
		li.add(s3);
		li.add(s4);
		
		//Accessing data from the list content
		//using for each
		
		for (Student s: li) {
			System.out.println("Student Name:"+ s.name);
			System.out.println("Student Roll no:"+ s.rollno);
			System.out.println("Student Age:"+ s.age);
			
		}
	}

}
