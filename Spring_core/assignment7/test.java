package assignment7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
public static void main(String[] args) {
		
		ApplicationContext contex=new ClassPathXmlApplicationContext("myfile1.xml");
		Merge arr=(Merge) contex.getBean("array5");
		
		arr.merge();
	}

}

