package assignment3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Emp {

	public static void main(String[] args) {
		String names=Arrays.asList("Vasundhara","Nikita","Akshay","Nikita","Kiran").stream().distinct().sorted().collect(Collectors.joining(","));
		System.out.println(names);
	}

}