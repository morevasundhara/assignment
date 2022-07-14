package assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Q1test {
	public static void main(String[] args) {
		 ApplicationContext objCtx = new ClassPathXmlApplicationContext("myfile1.xml");
		Q1 obj=(Q1) objCtx.getBean("objq1");
		obj.show();

	}

}


