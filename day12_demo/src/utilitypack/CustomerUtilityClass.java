package utilitypack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

import pojoclass.Customer;

public class CustomerUtilityClass {

	public void displayAll(List<Customer> list) {
//		for(Customer c1:list) {
//			Consumer<Customer> consumer=(l)->System.out.println(l);
//			consumer.accept(c1);
//		}
		list.forEach((l)->{
			System.out.println(l);
		});
	}
	public void sortByBillDecendingOrder(List<Customer> list) {
		List<Customer> orderlist=list.stream().sorted(Comparator.comparingDouble(Customer::getCustomerTotalBill).reversed()).collect(Collectors.toList());
		displayAll(orderlist);
	}
	public void searchbyAreaCode(List<Customer> list,String s1) {
		List<Customer> filetrby=list.stream().filter((t)->t.getCustomerAreaCode().equals(s1)).collect(Collectors.toList());
		displayAll(filetrby);
	}
	public List<Customer> getList(List<Customer> list,String s1){
		return list.stream().filter((t)->t.getCustomerAreaCode().equals(s1)).collect(Collectors.toList());
	}
	public void dosomething(List<Customer> list) {
		List<String > access=new ArrayList<>();
		for(Customer c1:list) {
			if(!access.contains(c1.getCustomerAreaCode())){
				dotask(c1.getCustomerAreaCode(), list);
				access.add(c1.getCustomerAreaCode());
			}
		}
	}
	
	public void dotask(String acess,List<Customer> list){
		Map<String,List<Customer>> map=new HashMap<>();
		map.put(acess, list);
		map.put(acess, getList(list, acess));
		System.out.println(acess+" Group ");
		searchbyAreaCode(list, acess);
		
	}
}



