package assignment17;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Employee {
	  String name;
	    static LocalDate dob;
	    static LocalDate doj;
	    LocalDate dor;
	    String location;
	    String department;
	    double salary;
	    static LocalDate today = LocalDate.now(); 
	    
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public LocalDate getDob() {
	        return dob;
	    }
	    public void setDob(LocalDate dob) {
	        this.dob = dob;
	    }
	    public LocalDate getDoj() {
	        return doj;
	    }
	    public void setDoj(LocalDate doj) {
	        this.doj = doj;
	    }
	    public LocalDate getDor() {
	        return dor;
	    }
	    public void setDor(LocalDate dor) {
	        this.dor = dor;
	    }

	    public String getLocation() {
	        return location;
	    }
	    public void setLocation(String location) {
	        this.location = location;
	    }
	    public String getDepartment() {
	        return department;
	    }
	    public void setDepartment(String department) {
	        this.department = department;
	    }
	    public double getSalary() {
	        return salary;
	    }
	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    @Override
	    public String toString() {
	        return "Employee [name=" + name + ", dob=" + dob + ", doj=" + doj + ", dor=" + dor + ", location=" + location
	                + ", department=" + department + ", salary=" + salary + ", getName()=" + getName() + ", getDob()="
	                + getDob() + ", getDoj()=" + getDoj() + ", getDor()=" + getDor() + ", getLocation()=" + getLocation()
	                + ", getDepartment()=" + getDepartment() + ", getSalary()=" + getSalary() + ", getClass()=" + getClass()
	                + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	    }
	    public Employee(String name, LocalDate dob, LocalDate doj, LocalDate dor, String location, String department,
	            double salary) {
	        super();
	        this.name = name;
	        this.dob = dob;
	        this.doj = doj;
	        this.dor = dor;
	        this.location = location;
	        this.department = department;
	        this.salary = salary;
	    }


	    public static void main(String[] args) 
	    {

	        //.....................dd................................................

	        List<Employee> employeeList = new ArrayList<Employee>();
	        employeeList.add(new Employee("rohan",LocalDate.of(1997,3, 03),LocalDate.of(2018,4,14),LocalDate.of(2020,5,13),"pune", "HR", 25000.0));
	        employeeList.add(new Employee( "Mohan", LocalDate.of(1996,4,12),LocalDate.of(2015,5,15),LocalDate.of(2022,1,11),"mumbai", "Sales And Marketing", 13500.0));
	        employeeList.add(new Employee( "tina",LocalDate.of(1997,3, 22),LocalDate.of(2019,6,14),LocalDate.of(2020,6,14),"bangalore", "Infrastructure", 18000.0));
	        employeeList.add(new Employee( "Mayur",LocalDate.of(1995,4,9),LocalDate.of(2017,5,22),null,"mumbai","Product Development",  32500.0));
	        employeeList.add(new Employee( "rushi",LocalDate.of(1999,12, 24),LocalDate.of(2018,6,23),LocalDate.of(2021,6,17) ,"pune", "HR", 22700.0));
	        employeeList.add(new Employee( "Iqbal ",LocalDate.of(1995,05, 11),LocalDate.of(2021,5,15),null,"banglore", "Infrastructure", 10500.0));
	        employeeList.add(new Employee( "Sharma", LocalDate.of(1998,07, 13),LocalDate.of(2019,5,28),LocalDate.of(2022,05,13),"pune", "Account And Finance", 27000.0));
	        employeeList.add(new Employee( "nikita",LocalDate.of(1994,6, 17),LocalDate.of(2015,6,22),LocalDate.of(2019,8,22),  "mumbai","Product Development", 34500.0));
	        employeeList.add(new Employee( "priya", LocalDate.of(1995,5, 15),LocalDate.of(2015,6,22),LocalDate.of(2019,7,24), "mumbai","Sales And Marketing",11500.0));
	        employeeList.add(new Employee( "Mohan", LocalDate.of(1996,4,12),LocalDate.of(2015,5,15),LocalDate.of(2022,1,11),"mumbai", "Sales And Marketing", 13500.0));

	        System.out.println("Employee in particular department--");

	                Map<String, List<Employee>> employeeListByDepartment=
	                employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));

	                Set<Entry<String, List<Employee>>> entrySet = employeeListByDepartment.entrySet();         
	                for (Entry<String, List<Employee>> entry : entrySet) 
	                {
	                    System.out.println("--------------------------------------");
	                    System.out.println("Employees In "+entry.getKey() + " : ");                            
	                    System.out.println("--------------------------------------");                           
	                    List<Employee> list = entry.getValue();        
	                    for (Employee e : list) 
	                    {
	                        System.out.println(e.getName());
	                    }
	                }



	                System.out.println("..........................................................");

	                System.out.println("Highest salary --");
	                Map<String, Optional<Employee>> maxx=employeeList.stream().
	                        collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
	                maxx.entrySet().forEach(System.out::println);


	                System.out.println("Lowest Salary--");
	                Map<String, Optional<Employee>> minn=employeeList.stream()
	                        .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.minBy(Comparator.comparingDouble(Employee::getSalary))));
	                minn.entrySet().forEach(System.out::println);



	                System.out.println("............................................................");

	                System.out.println("Average salary of each department--");
	                Map<String, Double> avgSalaryOfDepartments=
	                employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));       
	                Set<Entry<String, Double>> entrySet1 = avgSalaryOfDepartments.entrySet();       
	                for (Entry<String, Double> entry : entrySet1) 
	                {
	                     System.out.println(entry.getKey()+" : "+entry.getValue());
	                }


	                System.out.println("............................................................");
	                System.out.println(" Number of employee in each department");
	                Map<String, Long>noofemployee=
	                        employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
	                System.out.println(noofemployee);


	                System.out.println("total no of exp");
	                
	                int exp = Period.between(doj,today).getYears();
	                System.out.println(exp);

	                System.out.println("upcomming birthdays");
	                Period d = Period.between(dob, today);
	                System.out.println(d.getYears());   



	    }
	}


