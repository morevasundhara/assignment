package assignment6;

public class Code6 {
	public static int count(String str)
	{
		int vow=0,con=0;
		
		String ref="aeiouAEIOU";
		
		for (int i = 0; i < str.length(); i++)
		{
			if((str.charAt(i)>='A'
					&& (str.charAt(i)<='Z')
					||(str.charAt(i)>='a')
					&&(str.charAt(i)<='z')))
					{
				if(ref.indexOf(str.charAt(i))!= -1)
					vow++;
					}
		}
		System.out.println("Number of Vowels = "+vow);
		return vow;
	}
	

}
