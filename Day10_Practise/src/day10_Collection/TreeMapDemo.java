package day10_Collection;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,Integer> tree=new TreeMap<>();
		tree.put(15, 20);
		tree.put(21,25);
		tree.put(65,95);
		tree.put(52, 253);
		System.out.println(tree);
		Set<Entry<Integer,Integer>> set=tree.entrySet();
		System.out.println(set);
		
	}

}
