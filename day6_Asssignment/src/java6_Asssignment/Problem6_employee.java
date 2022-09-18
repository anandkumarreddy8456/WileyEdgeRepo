package java6_Asssignment;

public class Problem6_employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address temp=new Address(12,"Seetha","Jubli","Hyderabad");
		Address permant=new Address(5,"banjara","Hitech","Hyderabad");
		Address []add=new Address[] {temp,permant};
		Employee e1=new Employee(15,"Anand",add);
		System.out.println(e1);
	}

}
class Employee{
	private int id;
	private String name;
	private Address[] address;
	public Employee(int id, String name, Address[] address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Employee() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address[] getAddress() {
		return address;
	}
	public void setAddress(Address[] address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
class Address{
	private int flatNum;
	private String faltName;
	private String roadName;
	private String cityName;
	public Address(int flatNum, String faltName, String roadName, String cityName) {
		super();
		this.flatNum = flatNum;
		this.faltName = faltName;
		this.roadName = roadName;
		this.cityName = cityName;
	}
	public Address() {
		super();
	}
	public int getFlatNum() {
		return flatNum;
	}
	public void setFlatNum(int flatNum) {
		this.flatNum = flatNum;
	}
	public String getFaltName() {
		return faltName;
	}
	public void setFaltName(String faltName) {
		this.faltName = faltName;
	}
	public String getRoadName() {
		return roadName;
	}
	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	@Override
	public String toString() {
		return "Address [flatNum=" + flatNum + ", faltName=" + faltName + ", roadName=" + roadName + ", cityName="
				+ cityName + "]";
	}
	
	
}
