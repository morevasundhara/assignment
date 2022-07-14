package assignment4;

public class Department {
	int Did;
	String Dname;
	
	
	
	public int getDid() {
		return Did;
	}



	public void setDid(int did) {
		Did = did;
	}



	public String getDname() {
		return Dname;
	}



	public void setDname(String dname) {
		Dname = dname;
	}



	public void showDept()
	{
		System.out.println("Dept Id : "+Did); 
		System.out.println("Dept Name : "+Dname); 
	}

}
