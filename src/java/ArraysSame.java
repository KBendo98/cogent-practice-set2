package exercises2;

import java.util.ArrayList;
import java.util.List;

public class ArraysSame {

	public static void main(String[] args) {
		int arr1[] = {1, 2, 2, 6, 5, 6, 3, 8, 9};
		int arr2[] = {2, 3, 5, 6, 8, 1, 9, 2, 6};
		
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		
		for(int i:arr1)
			l1.add(i);
		
		for(int i:arr2)
			l2.add(i);
		
		System.out.println(l1.containsAll(l2));
	}

}
