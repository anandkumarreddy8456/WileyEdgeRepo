package day9_collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new LinkedList<>();
		for(int i=0;i<5;i++) {
			list.add(52+i);
		}
		System.out.println(list);
		list.add(1, 15);
		System.out.println(list);
		List<Integer>list2=new LinkedList<>();
		for(int i=0;i<5;i++) {
			list2.add(52+i);
		}
		System.out.println("Adding all elements at index at 2");
		list2.addAll(2,list);
		System.out.println(list2);
		System.out.println("Adding all elements at index at ");
		list2.addAll(list);
		System.out.println(list2);
	}

}
