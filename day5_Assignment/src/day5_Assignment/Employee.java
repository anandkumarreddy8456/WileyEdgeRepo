package day5_Assignment;
@SuppressWarnings("unused")
public class Employee {
	private int empId;
	private String empName;
	private String empDept;
	private double empBasicSal;
	private double empGrossSal;
	public Employee(int empId, String empName, String empDept, double empBasicSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empBasicSal = empBasicSal;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public double getEmpBasicSal() {
		return empBasicSal;
	}
	public void setEmpBasicSal(double empBasicSal) {
		this.empBasicSal = empBasicSal;
	}
	public double grossSalary() {
		double da=(empBasicSal*8)/100;
		double hra=(empBasicSal*12)/100;
		empGrossSal=empBasicSal+da+hra;
		return empGrossSal;
	}
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		else  if(obj instanceof Employee){
			Employee e1=(Employee)obj;
			if(e1.empId==this.empId && e1.empName.equals(this.empName)) {
				return true;
			}
			return false;
		}
		return false;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empBasicSal="
				+ empBasicSal + ", empGrossSal=" + empGrossSal + "]";
	}
}
