package exceptionpack;


public class ExceptionHandle {
	
	public static boolean checkValidInt(String val) {
		boolean flag=false;
		try {
		int num=Integer.parseInt(val);
		 if(num<=0) {
			 flag=false;
			 new NegativeException("Please provide value greate 0");
			 return flag;
		}
		 flag=true;
		}catch(Exception e) {
			flag=false;
			 new NumberException("Please provide valid Number");
			 return flag;
		}
		return flag;
		 
	}
	public static boolean checkValidUnits(String val) {
		boolean flag=false;
		try {
		double num=Double.parseDouble(val);
		 if(num<=0) {
			 flag=false;
			 new NegativeException("Please provide value greate 0");
			 return flag;
		}
		 flag=true;
		}catch(Exception e) {
			flag=false;
			 new NumberException("Please provide valid units");
			 return flag;
			
		}
		return flag;
		 
	}
	public static boolean checkValidMonth(String val) {
		boolean flag=false;
		try {
		int num=Integer.parseInt(val);
		 if(num<=0) {
			 flag=false;
			 new NegativeException("Please provide value greate 0");
			 return flag;
		 }
		 else if(num>12) {
			 flag=false;
			 new ValidMonth("Please Provide month in the range Between 1 and 12");
			 return flag;
		 }
		 flag=true;
		}catch(Exception e) {
			flag=false;
			 new NumberException("Please provide valid Number");
			 return flag;
		}
		return flag;
	}
	
	public static boolean checkId(String id) {
		try{
			int val=Integer.parseInt(id);
			//System.out.println(val);
			if(val<0) {
				new NegativeException("Id should be more than 0");
				return false;
			}
			return true;
		}
		catch(Exception e) {
			new NumberException("Please enter Valid Id");
			return false;
		}
	}
	public static boolean checkUnits(String id) {
		try{
			int val=Integer.parseInt(id);
			if(val<0) {
				new NegativeException("Number of Units should be more than 0");
				return false;
			}
			return true;
		}
		catch(Exception e) {
			 new NumberException("Please enter Valid Units");
			 return false;
		}
	}

}
@SuppressWarnings("serial")
class ValidMonth extends RuntimeException{
	public ValidMonth(String s) {
		System.out.println(s);
	}
}
@SuppressWarnings("serial")
class NumberException extends RuntimeException{
	
	NumberException(String s) {
		System.out.println(s);

	}
}
@SuppressWarnings("serial")
class NegativeException extends RuntimeException{
	public NegativeException(String s) {
		System.out.println(s);
	}
}
