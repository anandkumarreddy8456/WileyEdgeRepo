package day10_Collection.advanceCollection;


import java.util.LinkedHashSet;
import java.util.Set;

public class SetEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> set=new LinkedHashSet<>();
		set.add(new Employee("anand","kumar"));
		set.add(new Employee("hello","world"));
		set.add(new Employee("hello","world"));
		set.add(new Employee("anand","kumar"));
		for(Employee e1:set) {
			System.out.println(e1);
		}
	}

}
