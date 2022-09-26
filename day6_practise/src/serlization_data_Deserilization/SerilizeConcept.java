package serlization_data_Deserilization;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectOutputStream;

public class SerilizeConcept {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		//Serlization  
		Marks m1=new Marks(56);
		Student s1=new Student(1,"Anand",m1);
		try {
			FileOutputStream fis=new FileOutputStream(new File("serlize.txt"));
			ObjectOutputStream ofis=new ObjectOutputStream(fis);
			ofis.writeObject(s1);
			ofis.close();
		}
		catch (FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}

	}

}
