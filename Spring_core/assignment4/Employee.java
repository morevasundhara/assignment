package assignment4;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	int empid;
	String empname;
	double salary;
	@Autowired
	Department dept;
	
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	public void showEmp()
	{
		System.out.println("Emp id : "+empid);
		System.out.println("Emp name : "+empname);
		System.out.println("Emp salary : "+salary);
		dept.showDept();
		
	}
	

}
