package serlization_data_Deserilization;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Student implements Serializable{
	int id;
	String name;
	transient Marks marks;
	public Student(int id, String name,Marks marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks=marks;
	}
	
	
}
