package day10_Collection.advanceCollection;




public class Employee implements Comparable<Employee>{

	String firstname;
	String lastname;
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
	public Employee(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	@Override
	public int hashCode() {
		return this.firstname.length()+this. lastname.length();
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Equals is invoked");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return this.firstname.equals(other.firstname) && this.lastname.equals(other.lastname);
	}
	
//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		Employee other=(Employee)o;
//		return this.firstname.compareTo(other.firstname);
//	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		Employee other=(Employee)o;
		return this.firstname.compareTo(other.firstname);
	}

}
