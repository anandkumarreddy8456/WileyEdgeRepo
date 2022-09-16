package java6_Asssignment;

import java.util.HashMap;
import java.util.Scanner;

public class Problem3_OccuranceChaarcter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		occurance(name);
		sc.close();

	}
	public static void occurance(String name) {
		HashMap<Character,Integer> value=new HashMap<>();
		for(int i=0;i<name.length();i++) {
			value.put(name.charAt(i),value.getOrDefault(name.charAt(i),0)+1);
		}
		System.out.println(value);
	}

}
