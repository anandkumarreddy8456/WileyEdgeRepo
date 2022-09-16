package day8_practise_FileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
			FileOutputStream file=new FileOutputStream(new File("anand.txt"));	
			file.write("I am Anand".getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileOutputStream file=new FileOutputStream(new File("anand.txt"),true);	
			file.write("I am Anand".getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileInputStream file=new FileInputStream(new File("anand.txt"));
			int no=0;
			while((no=file.read())!=-1) {
				System.out.print((char)no);
			}
		}catch(Exception e) {
			System.out.print(e);
		}
		
	}

}
