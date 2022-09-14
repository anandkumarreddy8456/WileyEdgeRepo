package day4project;

import java.util.ArrayList;
import java.util.Scanner;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);	
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int div=sc.nextInt();
		ArrayList<ArrayList<Integer>>values=new ArrayList<>();
		int count=0;
		for(int i=0;i<num;i++) {
			ArrayList<Integer> numArrayList=new ArrayList<>();
			for(int j=0;j<div;j++) {
				numArrayList.add(arr[count]);
				count++;
			}
			values.add(numArrayList);
		}
		for(int i=0;i<values.size();i++) {
			System.out.println(values.get(i));
		}
	}

}
