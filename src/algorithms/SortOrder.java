package algorithms;

import java.util.function.BiFunction;

public abstract class SortOrder implements Sortable {
	
	public long sortAscending(Integer [] values) {
		long start = System.currentTimeMillis();
		sort(values,  SortOrders::ascending);
		long end = System.currentTimeMillis();
		return (end - start);

	}

	public long sortDescending(Integer [] values) {
		long start = System.currentTimeMillis();
		sort(values, SortOrders::descending);
		long end = System.currentTimeMillis();
		return (end - start);
	}
	
	public abstract void sort(Integer [] values, BiFunction<Integer, Integer, Boolean> order);
}
