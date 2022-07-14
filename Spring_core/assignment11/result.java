package assignment11;

public class result {
int roll_no;
int math;
int english;
int hindi;
int sciene;
int total_mark;

public int getTotal_mark() {
	return total_mark ;
}

public int getRoll_no() {
	return roll_no;
}
public void setRoll_no(int roll_no) {
	this.roll_no = roll_no;
}
public int getMath() {
	return math;
}
public void setMath(int math) {
	this.math = math;
}
public int getEnglish() {
	return english;
}
public void setEnglish(int english) {
	this.english = english;
}
public int getHindi() {
	return hindi;
}
public void setHindi(int hindi) {
	this.hindi = hindi;
}
public int getSciene() {
	return sciene;
}
public void setSciene(int sciene) {
	this.sciene = sciene;
}
public result(int roll_no, int math, int english, int hindi, int sciene ) {
	super();
	this.roll_no = roll_no;
	this.math = math;
	this.english = english;
	this.hindi = hindi;
	this.sciene = sciene;
	this.total_mark=sciene+math+english+hindi;
	
}
public void showresult() {
	System.out.println("roll no"+roll_no);
	System.out.println("math"+math);
	System.out.println("english"+english);
	System.out.println("hindi"+hindi);
	System.out.println("science"+sciene);
	System.out.println("total marks"+total_mark);
}

}
