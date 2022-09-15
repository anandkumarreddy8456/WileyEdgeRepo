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
 class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(fact(num));
		System.out.println(len(num));
		sc.close();
	}
	public static String fact(int num){
	    ArrayList<Integer> val=new ArrayList<>();
		for(int i=1;i<=num;i++){
		    if(num%i==0){
		        val.add(i);
		    }
		}
		String res="";
		for(int i=0;i<val.size();i++){
		    res=res+val.get(i);
		    if(i!=val.size()-1){
		        res=res+" ";
		    }
		}
		//System.out.println(val);
		return res;
	}
	public static int len(int num){
	    String res=num+"";
	    return res.length();
	}
}
