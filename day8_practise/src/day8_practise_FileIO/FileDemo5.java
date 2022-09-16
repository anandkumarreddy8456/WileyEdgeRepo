package day8_practise_FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader bufferedReader=new BufferedReader(new FileReader(new File("abc.txt")));
			String val=null;
			while((val=bufferedReader.readLine())!=null) {
				System.out.println(val);
//				val=bufferedReader.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
