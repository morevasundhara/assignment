package assignment5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import assignment5.maxnumber;

public class test {
public static void main(String[] args) {
		
		ApplicationContext contex=new ClassPathXmlApplicationContext("myfile1.xml");
		maxnumber max=(maxnumber)contex.getBean("max1");
		
		max.show();
		max.maxNum();
		
	}

}
