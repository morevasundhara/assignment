package assignment7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class EvenpriceTest {

	public static void main(String[] args) {
		List<Evenprice>elist=new ArrayList<Evenprice>();
		elist.add(new Evenprice(1,"Coffee",20f));
		elist.add(new Evenprice(2,"Pen",15f));
		elist.add(new Evenprice(3,"Tea",20f));
		elist.add(new Evenprice(4,"Shoes",50f));
		elist.add(new Evenprice(5,"Bag",300f));
		elist.add(new Evenprice(6,"Shirt",500f));
		elist.add(new Evenprice(7,"Pant",700f));
		List<Float> Elist=elist.stream().filter(p->p.itemprice%2==0).map(p->p.itemprice).collect(Collectors.toList());
		System.out.println(Elist);
	}

}
