package day8_practise_FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter file=new FileWriter(new File("filewritter.txt"));
			file.write("Hello I am Anand Reddy Who is Doing as Job");
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileReader filereader=new FileReader(new File("filewritter.txt"));
			int length=0;
			while((length=filereader.read())!=-1) {
				System.out.print((char)length);
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
