package day10_Collection.advanceCollection;

import java.util.HashMap;
import java.util.Map;

public class NestedMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Map<String,Integer>> cars=new HashMap<>();
		
		Map<String,Integer> engine=new HashMap<String, Integer>();
		engine.put("Bosch", 5000);
		engine.put("Amazon", 6000);
		engine.put("SAP",3602);
		cars.put("Sports", engine);
		cars.put("Echo", engine);
		System.out.println(cars);
		for(Map.Entry<String, Map<String,Integer>> entry:cars.entrySet()) {
			Map<String,Integer> engineavil=entry.getValue();
			System.out.println(engineavil);
		}
	}

}
