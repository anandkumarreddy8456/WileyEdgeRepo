package day5_Assignment;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AssignmentApp {

	public static void main(String[] args) {
		//problem 1
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Number of Employees :");
		int num=sc.nextInt();
		Employee []emp=new Employee[5];
		
		  for(int i=0;i<num;i++) {
			  System.out.println("Please Enter "+(i+1)+"st Employee id :"); 
			  int  id=sc.nextInt();
			  System.out.println("Please Enter "+(i+1)+"st Employee Name :"); 
			  String name=sc.next(); 
			  System.out.println("Please Enter "+(i+1)+"st Employee dept :");
			  String dept=sc.next();
			  System.out.println("Please Enter  "+(i+1)+"st Employee bascic Salary :");
			  double sal=sc.nextDouble(); 
			  emp[i]=new Employee(id,name,dept,sal); 
		  }
		 // sorting based on gross salaries;
		
		  System.out.println(sort(emp));
		  System.out.println("Enter  Department Name  to make a separate Group : ");
		  String dept=sc.next();
		  
		// Group by based on Department 
		  System.out.println(filter(emp, dept));
		
		//problem 2
		Employee e1=new Employee(1,"Anand","Java",15);
		Employee e2=new Employee(1,"Anand","HTML",15);
		Employee e3=new Employee(2,"Kumar","SQL",15);
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		sc.close();
	}
	public static List<Employee> sort(Employee e1[]){
		List<Employee> unsort=Arrays.asList(e1);
		List<Employee>sort=unsort.stream().sorted(Comparator.comparingDouble(Employee::grossSalary)).collect(Collectors.toList());
		return sort;
	}
	public static List<Employee> filter(Employee e1[],String dept){
		List<Employee> unfill=Arrays.asList(e1);
		List<Employee> filter=unfill.stream().filter(str->str.getEmpDept().equals(dept)).collect(Collectors.toList());
		return filter;
	}
}

//		emp[0]=new Employee(1,"Anand","Java",15); 
//		emp[1]=new Employee(2,"Reddy","HTML",15);  
//		emp[2]=new Employee(3,"Kumar","SQL",15); 
//		emp[3]=new Employee(4,"Naresh","SQL",15); 
//		emp[4]=new Employee(5,"Krish","Java",20);


