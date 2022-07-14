package assignment13;

public class show9_12 implements show{

	@Override
	public void moviename() {
		System.out.println("movie name:-"+"KGF2");
		
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
