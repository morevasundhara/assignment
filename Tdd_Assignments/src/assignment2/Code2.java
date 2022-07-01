package assignment2;

public class Code2 {

	public static boolean palin1(String s1,String s2)
	{
		int i=0;
		char s[]=s1.toCharArray();
		int j=s.length-1;
		while(i<j)
		{
			char temp=s[i];
			s[i]=s[j];
			s[j]=temp;
			i++;
			j--;
		}
		String str=new String(s);
		if(str.equals(s2) && str.equals(s1))
		{
			System.out.println(s1+" is palindrome");
			return true;
		}else
		{
			System.out.println(s1+" is not palindrome");
			return false;

		}
	}
}
