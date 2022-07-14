package assignment3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import assignment15.customer;

public class test {
	public static void main(String args[]) {
		ApplicationContext objctx=new ClassPathXmlApplicationContext("myfile1.xml");
		interest obj=(interest) objctx.getBean("objint");
        obj.show();
}
}