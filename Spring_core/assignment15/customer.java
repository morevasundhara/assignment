package assignment15;

public class customer {
String cname;
String address;
category objcat;

public customer(String cname, String address, category objcat) {
	super();
	this.cname = cname;
	this.address = address;
	this.objcat = objcat;
}


public customer() {
	
}


public void showcdetails()
{
	System.out.println("customer name:-"+cname);
	System.out.println("address:-"+address);
	objcat.showdetail();
}

}
