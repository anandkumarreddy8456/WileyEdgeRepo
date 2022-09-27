package exceptions;

public class ExceptionHandle {
	
	
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
class NumberException extends RuntimeException{
	
	NumberException(String s) {
		System.err.println(s);

	}
}
@SuppressWarnings("serial")
class NegativeException extends RuntimeException{
	public NegativeException(String s) {
		System.err.println(s);
	}
}
