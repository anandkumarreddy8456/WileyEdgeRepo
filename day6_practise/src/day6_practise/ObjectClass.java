package day6_practise;

public class ObjectClass {

	public static void main(String[] args) {
		
		// toString() this method available all classes including Collection classes
		
		Student s1=new Student(1,"Anand");
		System.out.println("With To String Instillation in Student "+s1.toString(s1));
		
		//hashCode()
		String str1=new String("ANAND");
		String str2=new String("anand");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		//equals() check the content comparison
		System.out.println(str1.equals(str2)?"both are equal":"both are not equal");
		str2=str2.toUpperCase();
		System.out.println(str1.equals(str2)?"both are equal":"both are not equal");
		
		//override equals() method 
		Student s2=new Student(1,"Kumar");
		System.out.println(s1.equals(s2)?"both are equal":"both are not equal");
	}

}
class Student {
    private int no;
    private String name;
    Student(){
        
    }Student(int no,String name){
        this.no=no;
        this.name=name;
        
    }
    public String getName(){
        return name;
    }
    public int getNo(){
        return no;
    }
    public String toString(){
        return name+" "+no;
    }
    public String toString(Object o1){
        System.out.println("Without To String Instillation in Student "+super.toString());
        return o1.toString();
    }
    @Override
    public boolean equals(Object o1) {
    	Student temp=(Student)o1;
    	return this.no==temp.no?true:false;
    }
    
    
}
