package assignment11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args)

	{
		
      Scanner sc =new Scanner(System.in);
   
		List<student> studlist = new ArrayList<student>();

		ApplicationContext objctx = new ClassPathXmlApplicationContext("myfile1.xml");
		student obj1 = (student) objctx.getBean("objstud");
		student obj2 = (student) objctx.getBean("objstud1");
		student obj3 = (student) objctx.getBean("objstud2");
		student obj4 = (student) objctx.getBean("objstud3");
		student obj5 = (student) objctx.getBean("objstud4");

		studlist.add(obj1);
		studlist.add(obj2); 
		studlist.add(obj3);
		studlist.add(obj4);
		studlist.add(obj5);
		
		for(student s: studlist) {
			System.out.println(s.Roll_no+" "+ s.sname+" "+ s.obj.total_mark);
		}
		
		
		System.out.println("Enter total marks");
		   int total=sc.nextInt();

		List<student> slist = studlist.stream().filter((s1->s1.obj.total_mark==total)).collect(Collectors.toList());
		
		for(student s2 : slist)
		{
			System.out.println(s2.Roll_no+" "+s2.sname);
		}
		
	}
}
