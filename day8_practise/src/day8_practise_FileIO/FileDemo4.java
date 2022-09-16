package day8_practise_FileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter file=new FileWriter(new File("abc.txt"),true);
			file.write("I am Ready to excute      ");
			file.close();// It needs to close else it won't take any input 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
