package multi_Threading_Practises;

import java.util.Scanner;

public class DeadLockDemo extends Thread{
	First first=new First();
	Second second=new Second();
	public void startsdead() {
		this.start();
		first.build1(second);
	}
	public void run() {
		second.build1(first);
	}
	public static void main(String[] args) {
		DeadLockDemo d1=new DeadLockDemo();
		d1.startsdead();

	}

}
class First{
	public synchronized void build1(Second second) {
		
		System.out.println("Thread1 starts Exceution ");
		try {
			Thread.sleep(10000);
			
		}catch(Exception e) {
			
		}
		System.out.println("Thread1 trying to call build2");
		second.build2();
	}
	public synchronized void build2() {
		System.out.println("Thread2 ends Excuted");
	}
}
class Second{
	public synchronized void build1(First first) {
		System.out.println("Thread2 starts Exceution ");
		try {
			Thread.sleep(10000);
			
		}catch(Exception e) {
			
		}
		System.out.println("Thread2 trying to call build2");
		first.build2();
	}
	public synchronized void build2() {
		System.out.println("Thread1 ends Excuted");
	}
	
	
}
class Doop{
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int row =sc.nextInt();
		int col=sc.nextInt();
		int max=Math.max(row, col);
		int arr[][]=new int[max][max];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		arr=square(arr);int req=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==j) {
					req=check(arr[i][j],arr)?(req+arr[i][j]):req;
				}
			}
		}
		System.out.println(req);
		
		sc.close();
		
	}
	public static int[][] square(int [][] arr){
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i][j]==0) {
					arr[i][j]=1;
				}
			}
		}
		return arr;
	}
	public static boolean check(int count,int arr[][]) {
		int mag=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i!=j) {
					mag=(arr[i][j]==count)?(++mag):mag;
				}
			}
		}
		
		return (mag%2==0)?false:true;
	}
}
