package exercises2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ThirdLargest {

	public static void main(String[] args) {
		int[] arr = {5,6,7,10,23,16,17,59,67,88};
		List<Integer> list = new ArrayList<>();
		
		for(int i:arr)
			list.add(i);
		
		System.out.println(list.stream().sorted()
				.collect(Collectors.toList()).get(list.size()-3));
	}

}
