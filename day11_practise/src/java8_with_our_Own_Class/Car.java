package java8_with_our_Own_Class;

public class Car {
	String firstname;
	String lastname;
	int model;
	public Car(String firstname, String lastname, int model) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.model = model;
	}
	@Override
	public String toString() {
		return "Car [firstname=" + firstname + ", lastname=" + lastname + ", model=" + model + "]";
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	
}
