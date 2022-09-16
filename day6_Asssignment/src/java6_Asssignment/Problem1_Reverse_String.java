package java6_Asssignment;

import java.util.Scanner;

public class Problem1_Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		reverse(name);
		sc.close();
	}
	public static void reverse(String name) {
		String res="";
		for(int i=0;i<name.length();i++) {
			res=res+name.charAt(name.length()-i-1);
		}
		System.out.println(res);
	}

}
