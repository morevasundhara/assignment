package assignment12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	List<Dept> dlist=new ArrayList<Dept>();
	ApplicationContext objctx = new ClassPathXmlApplicationContext("myfile1.xml");
	Dept obj1 = (Dept) objctx.getBean("objdept");
	Dept obj2 = (Dept) objctx.getBean("objdept1");
	Dept obj3 = (Dept) objctx.getBean("objdept2");
	Dept obj4 = (Dept) objctx.getBean("objdept3");
	Dept obj5 = (Dept) objctx.getBean("objdept4");
	dlist.add(obj1);
	dlist.add(obj2);
	dlist.add(obj3);
	dlist.add(obj4);
	dlist.add(obj5);
	for(Dept s:dlist) {
		System.out.println(s.deptname+" "+ s.empobj.empname+" "+ s.empobj.salary);
		
	}
	
	
	Dept sobj = dlist.stream().max( (s1,s2)->s1.empobj.salary>s2.empobj.salary?1:-1).get();
	System.out.println("Highest salary Emp name :"+sobj.empobj.empname +" "+"salary"+sobj.empobj.salary);

	double aveSalary=dlist.stream().collect(Collectors.averagingDouble(i->i.empobj.salary));
	System.out.println("Average salary : "+aveSalary);
	System.out.println("name of the emp havaing salary less than average salary");
	
	
	
	List<Dept> ave=dlist.stream().filter(i->i.empobj.salary<aveSalary).collect(Collectors.toList());
	
	for(Dept e:ave)
	{
		System.out.println(e. empobj.empname+"  "+e.empobj.salary);
	}
	
	
	
	System.out.println("-------------------------------");
	
	System.out.println("average sal of each department");
	
	
	
//	  System.out.println("Average salary of each department--");
//        Map<String, Double> avgSalaryOfDepartments=
 //      dlist.stream().collect(Collectors.groupingBy(Dept::getDeptname, Collectors.averagingDouble(Dept::empobj.getSalary)));       
 //       Set<Entry<String, Double>> entrySet1 = avgSalaryOfDepartments.entrySet();       
//        for (Entry<String, Double> entry : entrySet1) 
//       {
//             System.out.println(entry.getKey()+" : "+entry.getValue());
//        }
        
}


	
	
}

