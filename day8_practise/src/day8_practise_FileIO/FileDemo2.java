package day8_practise_FileIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Overidding the Exist the writter
		try {
			FileOutputStream file=new FileOutputStream("abc.txt");
			file.write("Hello I am Here".getBytes());
			file.write("Hello i am Lately Join ".getBytes());
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Attaching the words with previous one
		try {
			FileOutputStream file=new FileOutputStream("abc.txt",true);
			file.write("Hello I am Here".getBytes());
			file.write("Hello i am Lately Join ".getBytes());
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
