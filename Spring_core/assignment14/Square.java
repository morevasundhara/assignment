package assignment14;

public class Square implements Shape{

	 public void area (int a)
	 {
		 System.out.println("area of square");
		 System.out.println(a*a);
	 }

	@Override
	public void sidesOfShape() {
		// TODO Auto-generated method stub
		System.out.println("sides of Square : "+4);	
	}
}
