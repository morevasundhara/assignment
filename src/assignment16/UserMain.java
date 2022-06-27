package assignment16;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

 class User
{
	String iname;
	String category;
	double price;
	String dom;
	String eom;
	public User(String iname, String category, double price, String dom, String eom) {
		super();
		this.iname = iname;
		this.category = category;
		this.price = price;
		this.dom = dom;
		this.eom = eom;
	}
	@Override
	public String toString() {
		return "User [iname=" + iname + ", category=" + category + ", price=" + price + ", dom=" + dom + ", eom=" + eom
				+ "]";
	}
	
	
}
public class UserMain {

	public static void main(String[] args) {

		List<User> itemlist=new ArrayList<>();
		itemlist.add(new User("shirt","clothes",700,"2022-1-03",null));
		itemlist.add(new User("oil","home",210,"2022-2-03","2022-12-03"));
		itemlist.add(new User("straightner","electronics",17,"2022-1-03",null));
		itemlist.add(new User("milk","food",60,"2022-05-16","2022-05-20"));
		itemlist.add(new User("pepsi","colddrink",45,"2022-04-17","2022-06-17"));
		
		System.out.println("Enter Category");
		Scanner sc= new Scanner(System.in);
		String cat=sc.next();
		List<User> ilist=itemlist.stream().filter(e->e.category.equals(cat)).collect(Collectors.toList());
		for (User list1:ilist)
		{
			System.out.println("item name= "+list1.iname+" price= "+list1.price+" date of manufacture "+list1.dom+" date of expiry "+list1.eom);
		}
		
		System.out.println("Enter starting letter of item,,, ");
		String start=sc.next();
		List<User> itemnames=itemlist.stream().filter(e->e.iname.startsWith(start.toLowerCase())).collect(Collectors.toList());
		for (User s:itemnames)
		{
			System.out.println("item name= "+s.iname+" category "+s.category+" price= "+s.price+" date of manufacture "+s.dom+" date of expiry "+s.eom);
		}
		System.out.println("Enter starting letter of item,,, ");
		String start1=sc.next();
		List<User> itemlist1=itemlist.stream().filter(e->e.iname.startsWith(start.toLowerCase())).collect(Collectors.toList());
		for (User s:itemnames)
		{
			System.out.println("item name= "+s.iname+" category "+s.category+" price= "+s.price+" date of manufacture "+s.dom+" date of expiry "+s.eom);
		}
		System.out.println("Enter date of manufacturing");
		String Dom=sc.next();
		System.out.println("Enter date of expiry");
		String Doe=sc.next();
		List<User> date1=itemlist.stream().filter(e->e.dom.contains(Dom)&&e.eom.contains(Doe)).collect(Collectors.toList());
		date1.stream().forEach(System.out::println);
		System.out.println("Enter min price :");
		int minprice=sc.nextInt();
		System.out.println("Enter max price :");
		int maxprice=sc.nextInt();
		List<User> price=itemlist.stream().filter(e->e.price>minprice && e.price<maxprice).collect(Collectors.toList());
		price.stream().forEach(System.out::println);
	}

}
