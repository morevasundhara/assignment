package assignment15;

public class item {
	String name;
	int id;
	float price;
	float discount;
	float finalprize;
	
 
	public item(String name, int id, float price, float discount ){
		
		this.name = name;
		this.id = id;
		this.price = price;
		this.discount = discount;
		this.finalprize = price-(price*discount)/100;
	}
	public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public float getDiscount() {
	return discount;
}
public void setDiscount(float discount) {
	this.discount = discount;
}
public float getFinalprize() {
	return finalprize;
}
public void setFinalprize(float finalprize) {
	this.finalprize = finalprize;
}
	public item() {
		
	}
	
	
	public void show()
	{
		System.out.println("item name:- " +name);
		System.out.println("item id:- "+ id);
		System.out.println("discount:-"+discount);
		System.out.println("price:-"+price);
		System.out.println("final price:-"+finalprize);
	}
	
	
	

}
