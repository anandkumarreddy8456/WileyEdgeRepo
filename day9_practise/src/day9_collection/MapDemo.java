package day9_collection;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String,Integer> hashMap=new LinkedHashMap<>();
		hashMap.put("Anand",15);
		hashMap.put("Kumar",16);
		hashMap.put("Reddy",15);
		hashMap.put("Arun",15);
		hashMap.put("Shivam",15);
		Set<String> keys=hashMap.keySet();
		System.out.println("Keys :"+keys);
		Collection<Integer>values=hashMap.values();
		System.out.println(values);
		
		
		Set<Entry<String ,Integer>> entry=hashMap.entrySet();
		String name="";
		for(Entry<String,Integer> i:entry) {
			if(i.getValue()==15) {
				 name=i.getKey();
			}
			//System.out.println(i.getKey());
		}
		System.out.println(name);
//		for(Map.Entry<String,Integer> i: hashMap.entrySet()) {
//			System.out.println(i.getKey());
//		}
	}

}
