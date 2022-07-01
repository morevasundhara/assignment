package assignment1;

public class Code1 {
	public static int Find(int a,int b)
	{
		int hcf=0;
		
		for (int i = 1; i <=a ||i<=b; i++)
		{
			if(a%i==0 && b%i==0)
				hcf=i;
		}
		System.out.println(hcf);
		return hcf;
	}


}
