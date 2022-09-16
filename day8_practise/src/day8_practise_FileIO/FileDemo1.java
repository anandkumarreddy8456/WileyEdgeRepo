package day8_practise_FileIO;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) {
		File file=new File("abc.txt");
		try {
			if(file.exists()) {
				file.createNewFile();System.out.println("File is alerady exsit");}
			else
				System.out.println("File is created");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
