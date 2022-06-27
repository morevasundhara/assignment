package assignment2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctNo {

	public static void main(String[] args) {

		List<Integer> list=Arrays.asList(1,5,3,4,6,3,8);
		List<Integer> sortedList=list.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println(list);
		System.out.println(sortedList);
	}

}
