package serlization_data_Deserilization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserlization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Deserlization 
		try {
			FileInputStream fis=new FileInputStream(new File("serlize.txt"));
			ObjectInputStream ofis=new ObjectInputStream(fis);
			Student s=(Student)ofis.readObject();
			System.out.println(s.id+" "+s.name+" "+s.marks);
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
