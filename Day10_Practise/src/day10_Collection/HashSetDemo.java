package day10_Collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer>hash=new HashSet<>();
		hash.add(15);
		hash.add(26);
		hash.add(36);
		System.out.println(hash);
		HashSet<Integer> hash2=new HashSet<Integer>();
		hash2.add(56);
		hash2.addAll(hash);
		System.out.println(hash2);
	}

}
