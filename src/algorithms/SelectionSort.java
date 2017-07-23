package algorithms;

import java.util.function.BiFunction;

public class SelectionSort extends SortOrder {

	@Override
	public void sort(Integer [] values, BiFunction<Integer, Integer, Boolean> order) {
		
		int i, j, minIndex;
		int n = values.length;
		for (i = 0; i < n - 1; i++) {
			minIndex = i;
			for (j = i + 1; j < n; j++)
				if (order.apply(values[j], values[minIndex]))
					minIndex = j;
			if (minIndex != i) {
				Integer temp 		= values[i];
				values[i] 			= values[minIndex];
				values[minIndex] 	= temp;
			}
		}
	}

}
