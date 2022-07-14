package assignment15;

public class category {
	String cat;
	String color;
	item objitem;
	
	public category(String cat, String color, item objitem) {
		
		this.cat = cat;
		this.color = color;
		this.objitem = objitem;
	}

	public category() {
	
	}
	public void showdetail()
	{
		System.out.println("category:-"+cat);
		System.out.println("color:-"+color);
		objitem.show();
	}
	

}
