package day3task;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int first=sc.nextInt();
		int last=sc.nextInt();
		Fibonacci.fibonacciSeries(first,last);
		sc.close();
	}

}
class Fibonacci{
	
	private static ArrayList<Integer> fibonacci(int first,int last){
		ArrayList<Integer> array=new ArrayList<>();
		ArrayList<Integer> array2=fibonacci(last);
		for(int i=0;i<array2.size();i++) {
			if(array2.get(i)>=first) {
				array.add(array2.get(i));
			}
		}
		return array;
		
	}
	public static void fibonacciSeries(int last) {
		System.out.println(fibonacci(last));
	}
	public static void fibonacciSeries(int first,int last) {
		System.out.println(fibonacci(first, last));
	}
	private static ArrayList<Integer> fibonacci(int last){
		ArrayList<Integer> array=new ArrayList<>();
		int num1=0;
		int num2=1;
		int num3=num1+num2;
		array.add(num1);
		while(num3<=last) {
			num1=num2;
			num2=num3;
			array.add(num2);
			num3=num1+num2;
		}
		return array;
	}
}
