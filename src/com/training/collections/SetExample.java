package com.training.collections;

import java.util.HashSet;
import java.util.Set;

import com.training.inheritance.Student;

public class SetExample {
	
	public static void main(String[] args) {
		Student student1 = new Student("Rani",12,"b");
		Student student2 = new Student("Rohan",1,"c");
		Student student3 = new Student("Miles",127,"d");
		Student student4 = new Student("Vicky",192,"c");
		Student student5 = new Student("Rani",12,"b");
		Set<Student> studentSet = new HashSet<>();
		
		
		studentSet.add(student1);
		studentSet.add(student2);
		studentSet.add(student3);
		studentSet.add(student4);
		studentSet.add(student5);
		//studentSet.add(student6);
		for(Student student : studentSet){
			System.out.println(student.getName());
		}
	}

}
