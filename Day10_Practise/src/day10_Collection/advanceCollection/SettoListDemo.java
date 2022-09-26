package day10_Collection.advanceCollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SettoListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set=new HashSet<>();
		set.add(15);
		set.add(25);
		set.add(65);
		set.add(96);
		//first way
		List<Integer> list1=new ArrayList<>(set);
		System.out.println(list1);
		
		//for each -loop
		List<Integer> list2=new ArrayList<>();
		for(Integer i:set) {
			list2.add(i);
		}
		System.out.println(list2);
		
	}

}
