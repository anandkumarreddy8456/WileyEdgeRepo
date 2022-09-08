package day3task;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int radius=sc.nextInt();
		Circle circle=new Circle(radius);
		circle.calculateArea();
		sc.close();
	}

}
class Circle{
	int radius;
	double area;
	Circle(int radius){
		this.radius=radius;
	}
	Circle(){
		super();
	}
	public  void  calculateArea() {
		double val=Math.PI*(this.radius*this.radius);
		System.out.println(val);
	}
}
