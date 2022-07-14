package assignment12;

public class Dept {
int deptno;
String deptname;
Emp empobj;
public int getDeptno() {
	return deptno;
}
public void setDeptno(int deptno) {
	this.deptno = deptno;
}
public String getDeptname() {
	return deptname;
}
public void setDeptname(String deptname) {
	this.deptname = deptname;
}
public Emp getEmpobj() {
	return empobj;
}
public void setEmpobj(Emp empobj) {
	this.empobj = empobj;
}
public Dept(int deptno, String deptname, Emp empobj) {
	super();
	this.deptno = deptno;
	this.deptname = deptname;
	this.empobj = empobj;
}
public Dept() {
	super();
	// TODO Auto-generated constructor stub
}

}
