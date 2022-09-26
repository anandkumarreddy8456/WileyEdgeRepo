package day10_Collection.advanceCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListwithEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> emp=new ArrayList<>();
		Employee emp1=new Employee("anand","reddy");
		Employee emp2=new Employee("raj","kumar");
		Employee emp3=new Employee("radha","Shyam");
		emp.add(emp3);
		emp.add(emp2);
		emp.add(emp1);
		System.out.println(emp);
		List<Employee> emps=Arrays.asList(new Employee("and","or"),new Employee("because","and"));
		System.out.println(emps);
		Collections.sort(emp, new EmployeeSortBasedoneFirstName());
		System.out.println(emp);
	}

}
