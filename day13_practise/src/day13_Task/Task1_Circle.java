package day13_Task;

import java.util.ArrayList;
import java.util.List;

public class Task1_Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> array=new ArrayList<>();
		array.add(15);
		array.add(20);
		array.add(23);
		array.add(26);
		array.add(56);
		System.out.println(rotate(array,1));
	}
	static int cal=0;
	public static int rotate(List<Integer> value,int find) {
		int k=1;
		while(value.size()!=cal-1) {
			
			if(k==find) {
				value=dooperate(value, k);
				k=1;
			}else {
				
				k++;
			}
		}
		for(int i:value) {
			if(i!=0) {
				return i;
			}
		}
		return 0;
	}
	public static List<Integer> dooperate(List<Integer> value,int pos){
		value.add(pos,0);
		cal++;
		return value;
	}

}
