package day8_practise_FileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Bufferreader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedWriter duff=new BufferedWriter(new FileWriter(new File("bufferedwritter.txt")));
			duff.write("I am Writting something in BufferedWritter");
			
			duff.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			BufferedReader buff=new BufferedReader(new FileReader(new File("bufferedwritter.txt")));
			String str=buff.readLine();
			while(str!=null) {
				System.out.println(str);
				str=buff.readLine();
				
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
