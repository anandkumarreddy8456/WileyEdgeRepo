package day10_Collection;

import java.util.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<>();
		map.put(5, "Anand");
		map.put(2, "Kumar");
		map.put(65, "Reddy");
		// set of Keys
		Set<Integer> keys=map.keySet();
		System.out.println("List of All keys : "+keys);
		// collections of values
		Collection<String> values=map.values();
		System.out.println("List of All Values: "+values);
		System.out.println("Get INstance of Key and Value Pairs :");
		for(Map.Entry<Integer, String> val :map.entrySet()) {
			System.out.println("Key :"+val.getKey()+" Value :"+val.getValue());
		}
		Set<Entry<Integer, String>> set=map.entrySet();
		System.out.println(set);
		
		System.out.println(map.getOrDefault(12,"Yelow"));
		
	}

}
