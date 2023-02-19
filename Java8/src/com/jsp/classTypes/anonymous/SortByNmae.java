package com.jsp.classTypes.anonymous;

import java.util.ArrayList;
import java.util.List;

public class SortByNmae {
public static void main(String[] args) {
	List<Student> l=new ArrayList<Student>();
	l.add(new Student (1,"sahana","sahana@gmail.com"));
	l.add(new Student (2,"aparna","aparna@gmail.com"));
	l.add(new Student (5,"bassa","bassa@gmail.com"));
	l.add(new Student (11,"savvi","savi@gmail.com")); 
	DataManager dataManager=new DataManager();
	List<Student> sortByNmane=dataManager.sortByNmae(l);
	List<Student> sortById=dataManager.sortById(l);
	List<Student> sortByEmail=dataManager.sortByEmail(l);
	
	 
	for(Student a:l)
	{
		System.out.println(a);
	}
	
}
}
