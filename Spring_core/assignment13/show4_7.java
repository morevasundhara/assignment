package assignment13;

public class show4_7 implements show {

	@Override
	public void moviename() {
	System.out.println("movie name:-"+"RRR");
		
	}

	@Override
	public void price(int a) {
	System.out.println("ticket price:-"+a);
		
	}

	@Override
	public void collection(int a, int b) {
		System.out.println("weekly collection:-"+a*b*7);
		
	}

}
