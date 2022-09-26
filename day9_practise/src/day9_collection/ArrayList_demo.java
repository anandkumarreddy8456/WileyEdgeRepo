package day9_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> array=new ArrayList<>();
		System.out.println(array);
		for(int i=0;i<5;i++) {
			array.add(10+i);
		}
		System.out.println(array);
		//Interate-for loop
		System.out.println("Normal For Loop");
		for(int i=0;i<array.size();i++) {
			System.out.println(array.get(i));
		}
		// enchance for loop
		System.out.println("Normal Enhance Loop");
		for(Integer i:array) {
			System.out.println(i);
		}
		//Iterator --->only forward direction,and iteams can be removed;
		Iterator<Integer> itr=array.iterator();
		System.out.println(" Using Iterator");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
