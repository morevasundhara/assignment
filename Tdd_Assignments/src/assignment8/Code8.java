package assignment8;

public class Code8 {

	public static int even(int a[])
	{
		int count=0;
		System.out.println("Even Numbers:");
		for (int i = 0; i < 9; i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]+" ");
				count++;
			}
		}
		return  count;
	}
}
