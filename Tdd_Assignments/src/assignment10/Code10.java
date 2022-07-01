package assignment10;

public class Code10 {
	
	public static String concat(String a[])
	{
		String s="";
		
		for (int i = 0; i < a.length; i++) 
		{
			if(i==a.length-1)
				s+=a[i];
			else
			s+=a[i]+"-";
		}
		return s;
	}

}
