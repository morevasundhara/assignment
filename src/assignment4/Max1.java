package assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class Max1 {

	public static void main(String[] args) {

		ArrayList<Integer> myList=new ArrayList<Integer>();
		
		myList.add(23);
		myList.add(45);
		myList.add(35);
		myList.add(27);
		myList.add(67);
		myList.add(83);
		myList.add(33);
		
		System.out.println("Maximum number in Array :"+Collections.max(myList));
	}

}
