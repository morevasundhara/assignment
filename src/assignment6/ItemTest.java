package assignment6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ItemTest {

	public static void main(String[] args) 
	{
		List<Item>Ilist=new ArrayList<Item>();
		Ilist.add(new Item(1,"Coffee",20f));
		Ilist.add(new Item(2,"Pen",15f));
		Ilist.add(new Item(3,"Tea",20f));
		Ilist.add(new Item(4,"Shoes",50f));
		Ilist.add(new Item(5,"Bag",300f));
		Ilist.add(new Item(6,"Shirt",500f));
		Ilist.add(new Item(7,"Pant",700f));
		
		double averageprice=Ilist.stream().collect(Collectors.averagingDouble(s1->s1.itemprice));
		System.out.println("Average Price:"+averageprice);
		List<Float> ilist=Ilist.stream().filter(p->p.itemprice>=averageprice).map(p->p.itemprice).collect(Collectors.toList());
				System.out.println(ilist);
	}

}
