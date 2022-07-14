package assignment6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class test {
public static void main(String[] args) {
		
		ApplicationContext contex=new ClassPathXmlApplicationContext("myfile1.xml");
		Vowel vowel=(Vowel)contex.getBean("vow1");
		vowel.result();
	}

}
