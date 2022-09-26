package day11_practise_java8_features_Functional_Interface;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
public class FunctionalInterfacesinUtilPackage {

	public static void main(String[] args) {
		//		Name				MethodName		 return type
		//1. Consumer<E> Interface    ------>accept ------>>void
		//2. Function<E,E> Interf     ------>apply  ------>>2nd Element
		//3. Predicate<E> Interface ------>test   ------>>boolean
		
		//1.Consumer F.Interface
		Consumer<String> consumer=new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t+" length is : "+t.length());
				
			}
		};
		consumer.accept("anand");
		Consumer<Integer> consumer2=(t)->System.out.println(t+" length is : "+((t+"").length()));
		consumer2.accept(15);
	
		//2.FunctionInterface
		Function<Integer, String> val=new Function<Integer, String>() {
			
			@Override
			public String apply(Integer p) {
				// TODO Auto-generated method stub
				return (p+"").length()+"";
			}
		};
		System.out.println(val.apply(15));
		
		Function<Integer,Integer> function=(i)-> i*10;
		System.out.println(function.apply(15));
		
		//Function<String,Integer> function=(a,b)->{return Integer.parseInt(a.length()+"");};
		
		//3.Predicate F.Interface
		Predicate<String> predicate=new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return t.length()<5;
			}
		};
		System.out.println(predicate.test("Helo"));
		
		Predicate<String> predicate2=(k)->k.length()<5;
		System.out.println(predicate2.test("Hello"));
		
	}

}
