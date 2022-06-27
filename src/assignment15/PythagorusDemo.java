package assignment15;

public class PythagorusDemo {

	 	public static void main(String[] args) {

	 		int a[]= {4,5,3,7,6,9,8,2};
	 		
	 		int count=0;
	 		for (int i = 0; i < a.length-3; i++)
	 		{
				int aa=a[i]*a[i];
				int bb=a[i+1]*a[i+1];
				int cc=a[i+2]*a[i+2];
				
				if(aa==bb+cc || bb==aa+cc || cc==aa+bb)
				{
					count++;
				}
			}
	 		System.out.println("Combinition of numbers satisfy pythagorus template :"+count);
	}

}
