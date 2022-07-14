package assignment1;



public class Q1 {
	private Q1()
	 {
		 System.out.println("constructor of Q1 is called");
	 }
	 public static Q1 getObjQ1()
	 {	 
		 return new Q1();
	 }
	 public void show()
	 {
		 System.out.println("hello from show method");	 		
	 }
	}


