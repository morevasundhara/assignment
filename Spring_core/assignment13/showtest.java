package assignment13;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class showtest {
	public static void main(String[] args) {
		
	
ApplicationContext contex=new ClassPathXmlApplicationContext("myfile1.xml");
	
	show12_3 show1=(show12_3)contex.getBean("first");
	show4_7 show2=(show4_7)contex.getBean("second");
	show9_12 show3=(show9_12)contex.getBean("third");
	
	
	System.out.println("select show time \n1. 12-3\n2. 4-7 \n3. 9-12");
	
	Scanner sc=new Scanner(System.in);
	int choice=sc.nextInt();
	
	switch(choice)
	{
	case 1: show1.moviename();
	System.out.println("enter ticket price");
	int price1=sc.nextInt();
	System.out.println("enter number of ticket sold in week");
	int numb1=sc.nextInt();
			show1.price(price1);
			show1.collection(price1,numb1);
			break;
	case 2: show2.moviename();
	System.out.println("enter ticket price");
	int price2=sc.nextInt();
	System.out.println("enter number of ticket sold in week");
	int numb2=sc.nextInt();
			show2.price(price2);
			show2.collection(price2,numb2);
			break;
	case 3:show3.moviename();
	System.out.println("enter ticket price");
	int price3=sc.nextInt();
	System.out.println("enter number of ticket sold in week");
	int numb3=sc.nextInt();
			show3.price(price3);
			show3.collection(price3,numb3);
			break;
			default: System.out.println("enter valid choice");
	
	}
	
	
}
	

}

