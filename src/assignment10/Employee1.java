package assignment10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class Employee1 {

	public static void main(String[] args) {

		List<Employee>elist=new ArrayList<Employee>();
		elist.add(new Employee(1,"Vasundhara",24000f));
		elist.add(new Employee(2,"Akshay",50000f));
		elist.add(new Employee(3,"Ruchet",25000f));
		elist.add(new Employee(4,"Akanksha",15000f));
		elist.add(new Employee(5,"Dhanashree",30000f));
		elist.add(new Employee(6,"Harry",55000f));
		elist.add(new Employee(7,"Sagar",37000f));
		elist.add(new Employee(8,"Sumit",37000f));
		elist.add(new Employee(9,"Pratik",37000f));
		elist.add(new Employee(10,"Sonali",37000f));
		Map<Integer,String>proMap=elist.stream().collect(Collectors.toMap(p->p.empid, p->p.ename));
		System.out.println(proMap);
		Set<String> EmpSet=elist.stream().map(p->p.ename).collect(Collectors.toSet());
		System.out.println(EmpSet);
	}

}
