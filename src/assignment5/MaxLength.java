package assignment5;

public class MaxLength {

	public static void main(String[] args) {

		String s="Welcome to Java World";
		
		long maxCharacters= s.chars().filter(ch-> ch!=' ').count();
		
		System.out.println("There are maximum "+maxCharacters + " characters in String");
	}

}
