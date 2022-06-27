package assignment9;

import java.util.function.Predicate;

public class Arrayevenodd {

	public static void main(String[] args) {

		Predicate<Integer> p1=i-> i%2==0;
		
		int numbers[]= {34,33,23,67,45,88,78,90,45};
		
		for (int num : numbers) 
		{
			if(p1.test(num))
			{
				System.out.println(num+"is even");
			}
		}
		
		Predicate<Integer> p2=i-> i%2!=0;
		
		for (int num : numbers) 
		{
			if(p2.test(num))
			{
				System.out.println(num+"is odd");
			}
		}
	}

}
