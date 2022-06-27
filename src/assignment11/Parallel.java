package assignment11;

import java.util.stream.IntStream;

public class Parallel {

	public static void main(String[] args) {

		System.out.println("Normal....");
		
		IntStream range1=IntStream.rangeClosed(1,10);
		range1.forEach(System.out::println);
		
		System.out.println("Parallel...");
		
		IntStream range2=IntStream.rangeClosed(1,10);
		range2.parallel().forEach(System.out::println);
		
		
	}

}
