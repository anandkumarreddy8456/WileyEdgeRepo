package day10_Collection.advanceCollection;

import java.util.ArrayList;
import java.util.HashMap;

public class NestedMapWithList {
	static HashMap<String,ArrayList<Car>> hash=new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		hash.put("Tata",new Car("ABC"));
//		hash.put("Tata", new Car("CDE"));
		add("Tata",new Car("ABC123"));
		add("Tata",new Car("XyZ123"));
		
		add("Fortune",new Car("lki2536"));
		System.out.println(hash);
	}
	public static  void add(String s,Car car) {
		ArrayList<Car> values=hash.get(s);
		if(values==null) {
			values=new ArrayList<Car>();
			values.add(car);
			hash.put(s, values);
		}else {
			if(!values.contains(car)) {
				values.add(car);
				hash.put(s, values);
			}
		}
	}

}
