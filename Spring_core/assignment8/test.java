package assignment8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class test {
	public static void main(String[] args) {
		
		ApplicationContext contex=new ClassPathXmlApplicationContext("myfile1.xml");
		ascending item=(ascending) contex.getBean("itemlist");
		
		item.show();
		System.out.println("--------------------------\n");
		
		
	item.ascending();
	System.out.println("--------------------------\n");
	item.descending();
	System.out.println("--------------------------\n");
		
	item.removeDuplicate();
		
	}

}
