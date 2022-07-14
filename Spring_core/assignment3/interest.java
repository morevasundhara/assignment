package assignment3;

import java.util.Scanner;

public class interest {
int amount;
int interest_rate;
int no_of_emi;
int emi;
int year;
Scanner sc=new Scanner(System.in);

public int getInterest_rate() {
	return interest_rate;
}
public void setInterest_rate(int interest_rate) {
	this.interest_rate = interest_rate;
}
public int getNo_of_emi() {
	return no_of_emi;
}
public void setNo_of_emi(int no_of_emi) {
	this.no_of_emi = no_of_emi;
}


public interest( int interest_rate) {
	
	this.interest_rate = interest_rate;
	
}
public interest() {
	
}
public void show() {
	System.out.println("enter amount");
	amount=sc.nextInt();
	System.out.println("emi");
	emi=sc.nextInt();
	System.out.println("enter year");
	year=sc.nextInt();
	this.no_of_emi=(amount+(amount*interest_rate*year)/100)/emi;
	System.out.println("no of emi:"+no_of_emi);
}

}
