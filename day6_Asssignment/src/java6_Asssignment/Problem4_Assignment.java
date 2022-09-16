package java6_Asssignment;

import java.util.Scanner;

public class Problem4_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num<=5) {
			System.out.println("Please Create array more than size 5");
		}else {
			int arr[]=new int[num];
			for(int i=0;i<num;i++) {
				arr[i]=sc.nextInt();
			}
			arrayprocess(arr);
		}
		sc.close();
		
	}
	public static void arrayprocess(int arr[]) {
		System.out.println("Array has Created and added the first and last values : "+(arr[0]+arr[arr.length-1]));
	}

}
