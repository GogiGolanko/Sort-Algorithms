package algorithms;

import java.util.Comparator;

public class SortOrders {
	
	public static boolean ascending(Integer i, Integer j) {
		return i.compareTo(j) > 0;
	}
	
	public static boolean descending(Integer i, Integer j) {
		return i.compareTo(j) < 0;
	}
}
