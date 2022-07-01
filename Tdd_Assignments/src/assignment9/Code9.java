package assignment9;

public class Code9 {

	public static String check(String a)
	{
		String s=a.replaceAll("[@$-.]","");
		return s;
	}
	
	public static void main(String[] args)
	{
		System.out.println(Code9.check("This @ Red $car-"));
	}
}
