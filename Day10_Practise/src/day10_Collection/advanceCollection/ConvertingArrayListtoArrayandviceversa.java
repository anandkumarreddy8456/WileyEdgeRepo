package day10_Collection.advanceCollection;


import java.util.Arrays;
import java.util.List;

public class ConvertingArrayListtoArrayandviceversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.converting Array to ArrayList
//		int ans[]=new int[] {1,2,3,4,5,6};
//		List<int[]> tolist=new ArrayList<>();
//		tolist=Arrays.asList(ans);
		
		//1.converting Array to ArrayList
//		Integer i1[]=new Integer[] {5,20,25,26,86};
//		List<Integer> toarray=Arrays.asList(i1);
//		System.out.println(toarray);
//		
//		//2.Converting List to list
//		int []val=toarray.toArray(new int[toarray.size()]);
		
		//1.converting Array to ArrayList
		String []ch=new String[] {"anand","kumar","reddy"};
		List<String> tolist=Arrays.asList(ch);
		System.out.println(tolist);
		
		//2.Converting List to Array
		String str[]=tolist.toArray(new String[tolist.size()]);
		for(String str2:str) {
			System.out.println(str2);
		}
		
	}

}
