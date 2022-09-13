package practise;

import java.util.ArrayList;

public class WrapperClasses {
	/*
	 * Main Objectivies of wrapper are :->To wrap primitive to Object form just like Objects
	 * 									:->To Describe several utilify Functions which are required for Primitivies.
	 */								 
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//-- Integer
		Integer i=new Integer(10);
		Integer i1=new Integer("10");
		//--Float
		Float f1=new Float(10);
		Float f2=new Float(10.5);
		Float f3=new Float("10.5");
		//--- Character
		Character c1=new Character('1');
		//-- Boolean
		Boolean b1=new Boolean(true);
		Boolean b2=new Boolean(false);
		Boolean b3=new Boolean("true");
		Boolean b4=new Boolean("false");
		//---- Utlity Functions
		
		//--- ValueOf()
		Integer i4=Integer.valueOf(45);
		Double d1=Double.valueOf("56.5");
		Boolean b5=Boolean.valueOf("anand");
		System.out.println(i4+" "+" "+d1+" "+b5);
		//-- xxxValue()
		Integer i5=new Integer(130);
		System.out.println(i5.byteValue());
		System.out.println(i5.shortValue());
		System.out.println(i5.intValue());
		System.out.println(i5.floatValue());
		System.out.println(i5.doubleValue());
		System.out.println(i5.longValue());
		
		Character c2=new Character('1');
		char ch=c2.charValue();
		System.out.println(c2);
		System.out.println(ch);
		
		Boolean b6=Boolean.valueOf("anand");
		boolean b7=b6.booleanValue();
		System.out.println(b6);
		System.out.println(b7);
		
		//----  parseXxx()
		System.out.println(Integer.parseInt("50"));
		System.out.println(Double.parseDouble("62.3"));
		System.out.println(Float.parseFloat("63.245"));
		System.out.println(Boolean.parseBoolean("anand"));
		System.out.println(Integer.parseInt("1000",2));
		
		//---- toString()
		Integer i3=new Integer("15");
		System.out.println(i3);
		System.out.println(i3.toString());
		
		//AutoBoxing  --> converting Primitive to Wrapper Object
		
		ArrayList<Integer> val=new ArrayList<>();	
		// internal implementation --> val.add(Integer.valueOf(10));
		val.add(10);
		System.out.println(val);
		
		//AutoUnboxing  -->Converting Wrapper to Primitive
		int res=Integer.parseInt("56");
		System.out.println(res);
		
		Integer val1=10;Integer val2=10; 
		System.out.println(val1==val2);
		
		Integer val3=100;Integer val4=100; 
		System.out.println(val4==val3);
		
		Integer val5=1000;Integer val6=1000; 
		System.out.println(val5==val6);// valid upto 127
		
		/*
		 * Widening: ----> Converting (int --> long) or (int --> (float or double))
		 * Narrowing: -->Converting (long -->int ) or ((double or float) -->int)
		 * 
		 * there is No relationShip from Integer and Double and cannot able to convert
		 */
	}

}
