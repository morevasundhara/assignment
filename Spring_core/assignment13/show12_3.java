package assignment13;

import assignment14.Shape;

public class show12_3 implements show {

	@Override
	public void moviename() {
		System.out.println("movie name:-"+"Radhe");
		
	}

	@Override
	public void price(int a) {
   System.out.println("Ticket price:-"+a);
	
	}

	@Override
	public void collection(int a,int b) {
	System.out.println("Total week collection is:-"+a*b*7);
		
	}

}
