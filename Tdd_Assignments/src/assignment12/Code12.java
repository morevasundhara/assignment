package assignment12;

public class Code12 implements Cloneable{
	
	int id;
	String name;
	public Code12(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

	public static boolean checkClone(Code12 c1, Code12 c2)
	{
		if(c1.id==c2.id && c1.name==c2.name)
			return true;
		else
			return false;
	}
	
}
