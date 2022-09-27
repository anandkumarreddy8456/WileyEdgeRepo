package serlization_data_Deserilization;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Marks implements Serializable{
	@Override
	public String toString() {
		return "Marks [marks=" + marks + "]";
	}

	int marks;

	public Marks(int marks) {
		super();
		this.marks = marks;
	}
	
}
