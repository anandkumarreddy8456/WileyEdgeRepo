package day13_Task;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3_ {
	
	public static void main(String[]rags) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		//sc.nextLine();
		int num=sc.nextInt();
		String ch[]=str.split(" ");
		ArrayList<ArrayList<String>> out=new ArrayList<>();
		int count=0;
		ArrayList<String> inner=new ArrayList<>();
		for(int i=0;i<ch.length;i++) {
			if(count<num) {
				inner.add(ch[i]);
				count++;
			}else {
				out.add(inner);
				inner.clear();
				count=0;
			}
		}
		for(ArrayList<String> aar:out) {
			System.out.println(aar);
		}
		sc.close();
	}
}
