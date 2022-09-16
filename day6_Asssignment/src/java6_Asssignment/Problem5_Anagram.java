package java6_Asssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Problem5_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name1=sc.next();
		String name2=sc.next();
		anagram(name1,name2);
		sc.close();
	}
	public static void anagram(String name1,String name2) {
		char ch1[]=name1.toCharArray();
		char ch2[]=name2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		String res1=new String(ch1);
		String res2=new String(ch2);
		if(res1.equals(res2)) {
			System.out.println("Two Strings are anagram");
		}else {
			System.out.println("Two Strings are not anagram");
		}
	}

}
