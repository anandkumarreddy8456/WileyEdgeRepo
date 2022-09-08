
public class Helloworld {
	public static void main(String []args) {
		Calcus cal=new Calcus();
		System.out.println("Maximum number is "+cal.maximumInteger(5, 10));
		System.out.println("Add All from num1 to num2 "+cal.addAllNumbers(5, 15));
		System.out.println("Sum of All Digits "+cal.sumofdigits(123));
		System.out.println("Value of Student Grade "+cal.gradeofStudent('A'));
		System.out.println("Sum of All Characters is "+cal.sumofCharacters("anand"));
		System.out.println("is "+5+" Prime Number ? Ans: "+cal.isPrime(5));
	}
}
class Calcus{
	public int maximumInteger(int num1,int num2) {
		//return num1>num2?num1:num2;
		if(num1>num2) {
			return num1;
		}else if(num1<num2) {
			return num2;
		}
		return num1;
	}
	public int addAllNumbers(int num1,int num2) {
		int req=0;
		for(int i=num1;i<=num2;i++) {
			req=req+i;
		}
		return req;
	}
	public int sumofdigits(int num1) {
		int res=0;
		while(num1!=0) {
			res=res+num1%10;
			num1=num1/10;
		}
		return res;
	}
	public int gradeofStudent(char ch) {
		switch(ch) {
		case 'A':
			return 65;
		case 'B':
			return 66;
		case 'C':
			return 67;
		default :
			return 50;
		}
	}
	public int sumofCharacters(String name) {
		int i=0;int res=0;
		do {
			res=res+name.charAt(i);
			i++;
		}
		while(name.length()!=i);
		return res;
	}
	public boolean isPrime(int num) {
		boolean flag=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
			continue;
		}
		return flag;
	}
}
