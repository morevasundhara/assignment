package assignment12;

public class Emp {
int empid;
String empname;
int salary;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public Emp(int empid, String empname, int salary) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.salary = salary;
}
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}

}
