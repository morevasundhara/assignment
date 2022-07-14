package assignment4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class emptest {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("myfile1.xml");
		Employee emp=(Employee) context.getBean("objemp");
		emp.showEmp();
		
		
		
		
		
		
		
	}

}
