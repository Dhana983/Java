package com.training.collections;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.training.inheritance.Student;

public class CollectionDemo {

	public static void main(String[] args) {
		Student student1 = new Student("sara",12,"b");
		Student student2 = new Student("john",1,"c");
		Student student3 = new Student("mile",127,"d");
		Student student4 = new Student("vicky",192,"c");
		Map<String ,Student> studentMap = new HashMap<>();
		studentMap.put("1", student1);
		studentMap.put("2", student2);
		studentMap.put("3", student3);
		studentMap.put("4", student4);
		for(Map.Entry<String, Student> entry : studentMap.entrySet()){
			String key = entry.getKey();
			Student student = entry.getValue();
			System.out.println("NAME: "+student.getName()+" GRADE: "+student.getGrade().toUpperCase());
		}
		
		//Set<Integer> values = new HashSet<>();
		/*List<Student> studentList = new ArrayList<>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		
		
		for(Student student: studentList){
			System.out.println(student.getName());
		}*/

	}

}
