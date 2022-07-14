package assignment11;

public class student {
String sname;
int Roll_no;
String Dob;
String Class_name;
String Section;
result obj;

public result getObj() {
	return obj;
}
public void setObj(result obj) {
	this.obj = obj;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getRoll_no() {
	return Roll_no;
}
public void setRoll_no(int roll_no) {
	Roll_no = roll_no;
}
public String getDob() {
	return Dob;
}
public void setDob(String dob) {
	Dob = dob;
}
public String getClass_name() {
	return Class_name;
}
public void setClass_name(String class_name) {
	Class_name = class_name;
}
public String getSection() {
	return Section;
}
public void setSection(String section) {
	Section = section;
}
public student() {
	super();
	// TODO Auto-generated constructor stub
}
public student(String sname, int roll_no, String dob, String class_name, String section,result obj) {
	super();
	this.sname = sname;
	Roll_no = roll_no;
	Dob = dob;
	Class_name = class_name;
	Section = section;
	this.obj=obj;
}

public void show() {
	System.out.println("Student name"+sname);
	System.out.println("Roll no"+Roll_no);
	System.out.println("Date of birth"+Dob);
	System.out.println("class name"+Class_name);
	System.out.println("section"+Section);
	obj.showresult();
	
}

}
