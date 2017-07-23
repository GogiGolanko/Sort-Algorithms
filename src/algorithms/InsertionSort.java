package algorithms;

import java.util.function.BiFunction;

public class InsertionSort extends SortOrder {
	
	public void sort(Integer [] values, BiFunction<Integer, Integer, Boolean> order) {

		for (int i = 1; i < values.length; i++) {
			int temp = values[i];
			int j;
			for (j = i - 1; j >= 0 && order.apply(temp, values[j]); j--) {
				values[j + 1] = values[j];
			}
			values[j + 1] = temp;
		}
	}
}
