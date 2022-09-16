package day8_practise_FileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("abc.txt");
		try {
			FileInputStream fileStream=new FileInputStream(f);
			int c=0;
			System.out.println(fileStream.available());
			while((c=fileStream.read())!=-1) {
				System.out.print((char)c);
			}
			fileStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
