package algorithms;

import java.util.function.BiFunction;

public class QuickSort extends SortOrder {

	private Integer[] values;
	private boolean or;

	@Override
	public void sort(Integer [] values, BiFunction<Integer, Integer, Boolean> order) {
		this.values = values;
		
		this.or = order.apply(0, 1);
		quicksort(0, this.values.length - 1);
	}

	private void quicksort(int x, int y) {

		int i, j, v, temp;

		i = x;
		j = y;
		v = this.values[(x + y) / 2];
		do {
			if (or) {
				while (this.values[i] < v)
					i++;
				while (this.values[j] > v)
					j--;
			} else if (!or) {
				while (this.values[i] > v)
					i++;
				while (this.values[j] < v)
					j--;
			}
			if (i <= j) {
				temp 			= this.values[i];
				this.values[i] 	= this.values[j];
				this.values[j] 	= temp;
				i++;
				j--;
			}
		} while (i <= j);
		if (x < j)
			quicksort(x, j);
		if (i < y)
			quicksort(i, y);
	}
}
