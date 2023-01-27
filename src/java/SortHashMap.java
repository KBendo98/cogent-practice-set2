package exercises2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMap {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("A", 6);
		map.put("C", 10);
		map.put("B", 4);
		map.put("D", 5);
		map.put("G", 1);
		map.put("H", 2);
		
		
		LinkedHashMap<String, Integer> sortedMap =
				map.entrySet().stream().sorted(Map.Entry.comparingByValue()).
				collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
						(m1, m2)->m1, LinkedHashMap::new));
		
		System.out.println(sortedMap);
	}
}
