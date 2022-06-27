package assignment12;

import java.util.ArrayList;
import java.util.List;

public class MaxNo {

	public static void main(String[] args) {

		List<Integer>list=new ArrayList<Integer>();
		Max m=(int a[])-> {
			for(int i=1;i<a.length;i++)
			{
				list.add(a[i]);
			}
			Integer Maximum = list.stream().max((e1, e2)->e1 > e2 ? 1:-1).get();
			System.out.println("Maximum number in Array = "+Maximum);
		};
		m.maxArray(new int[] {66,23,90,98,35});
	}

}
