package day3task;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle=new Circle(5);
		circle.calculateArea();
	}

}
class Circle{
	int radius;
	double area;
	Circle(int radius){
		this.radius=radius;
	}
	Circle(){
		
	}
	public  void  calculateArea() {
		double val=Math.PI*(this.radius*this.radius);
		System.out.println(val);
	}
}
